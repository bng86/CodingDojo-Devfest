package tw.andyang.codingdojo

class PokerParser {

    companion object {
        fun parse(intput: String) : Poker{
            val suitString = intput.substring(0)
            val pointString = intput.substring(1)
            val suit = when (suitString) {
                "C" -> Suit.Clubs
                else -> TODO()
            }
            // TODO
            return Poker(suit, 0)
        }
    }

}
