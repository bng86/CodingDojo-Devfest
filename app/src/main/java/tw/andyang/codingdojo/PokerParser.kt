package tw.andyang.codingdojo

class PokerParser {

    companion object {
        fun parse(input: String): Poker {
            val suitString = input.substring(0, 1)
            val pointString = input.substring(1)
            val suit = when (suitString) {
                "C" -> Suit.Clubs
                "S" -> Suit.Spade
                "H" -> Suit.Hearts
                "D" -> Suit.Diamonds
                else -> throw Exception()
            }
            val point = when (pointString) {
                "A" -> 1
                "J" -> 11
                "Q" -> 12
                "K" -> 13
                else -> pointString.toInt()
            }
            return Poker(suit, point)
        }

        fun isFlush(pokers: ArrayList<Poker>): Boolean {

            val set = HashSet<Suit>()
            for (poker in pokers) {
                set.add(poker.suit)
            }
            return set.size == 1
        }

        fun isFourOfAKind(pokers: java.util.ArrayList<Poker>): Boolean = pokers.groupBy { it.point }.any { it.value.size == 4 }
        fun isFullHouse(pokers: ArrayList<Poker>): Boolean {


            val group  = pokers.groupBy { it.point }
            if (group.size != 2) {
                return false
            }

            return group.any { it.value.size == 3 } && group.any { it.value.size == 2 }
        }

    }

}
