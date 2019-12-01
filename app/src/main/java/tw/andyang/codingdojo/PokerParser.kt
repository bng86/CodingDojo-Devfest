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

        fun isFourOfAKind(pokers: java.util.ArrayList<Poker>): Boolean {
            val pointList =pokers.map { poker ->  poker.point}
            pointList.forEach({p->
                if(pointList.filter { it == p }.size == 4){

                }
            })
            val set = HashSet<Int>()
            for(poker in pokers){
                set.add(poker.point)
            }

            return set.size == 2
        }
    }

}
