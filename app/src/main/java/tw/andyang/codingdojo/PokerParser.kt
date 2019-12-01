package tw.andyang.codingdojo

class PokerParser {

    companion object {
        fun parse(input: String): Poker {
            val suitString = input.substring(0,1)
            val pointString = input.substring(1)
            val suit = when (suitString) {
                "C" -> Suit.Clubs
                "S" ->  Suit.Spade
                else-> throw Exception()
            }
            val point = when (pointString) {
                "A" -> 1
                "J" -> 11
                "Q" -> 12
                "K" -> 13
                else-> pointString.toInt()
            }
            return Poker(suit, point)
        }
    }

}
