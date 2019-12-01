package tw.andyang.codingdojo

class PokerParser {

    companion object {
        fun parse(input: String): Poker {
            val suitString = input.substring(0)
            val pointString = input.substring(1)
            val suit = when (suitString) {
                "C" -> Suit.Clubs
                "S" ->  Suit.Spade
                else-> throw Exception()
            }
            return Poker(suit, 2)
        }
    }

}
