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


    @Test
    fun `input SA  is Spade 1`() {
        val input = "SA"
        val actual: Poker = PokerParser.parse(input)
        val expected = Poker(Suit.Spade, 1)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `input SJ  is Spade 11`() {
        val input = "SJ"
        val actual: Poker = PokerParser.parse(input)
        val expected = Poker(Suit.Spade, 11)
        Assert.assertEquals(expected, actual)
    }
    @Test
    fun `input SQ  is Spade 12`() {
        val input = "SQ"
        val actual: Poker = PokerParser.parse(input)
        val expected = Poker(Suit.Spade, 12)
        Assert.assertEquals(expected, actual)
    }
    @Test
    fun `input SK  is Spade 13`() {
        val input = "SK"
        val actual: Poker = PokerParser.parse(input)
        val expected = Poker(Suit.Spade, 13)
        Assert.assertEquals(expected, actual)
    }
}