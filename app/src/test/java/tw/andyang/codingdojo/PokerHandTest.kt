package tw.andyang.codingdojo

import org.junit.Assert
import org.junit.Test

class PokerHandTest {

    @Test
    fun `input C2 is Clubs 2`() {
        val input = "C2"
        val actual: Poker = PokerParser.parse(input)
        val expected = Poker(Suit.Clubs, 2)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `input S3  is Spade 3`() {
        val input = "S3"
        val actual: Poker = PokerParser.parse(input)
        val expected = Poker(Suit.Spade, 3)
        Assert.assertEquals(expected, actual)
    }


}