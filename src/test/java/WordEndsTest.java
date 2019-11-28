import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEndsTest {

    //GIVEN
    WordEnds wordEnds = new WordEnds();

    @Test
    public void shouldTestNullString () {
        //WHEN
        String answer = wordEnds.wordEnds(null, "ss");

        //THEN
        assertNull(answer);
    }
    @Test
    public void shouldTestNullWord () {
        //WHEN
        String answer = wordEnds.wordEnds("asd", null);

        //THEN
        assertEquals("", answer);

    }
    @Test
    public void shouldTestEmptyString () {
        //WHEN
        String answer1 = wordEnds.wordEnds("", "");
        String answer2 = wordEnds.wordEnds("", "hello");

        //THEN
        assertEquals("", answer1);
        assertEquals("", answer2);
    }
    @Test
    public void shouldTestEmptyWord () {
        //WHEN
        String answer1 = wordEnds.wordEnds("", "");
        String answer2 = wordEnds.wordEnds("hello", "");

        //THEN
        assertEquals("", answer1);
        assertEquals("", answer2);
    }
    @Test
    public void shouldTestStringWithoutWord () {
        //WHEN
        String answer1 = wordEnds.wordEnds("", "");
        String answer2 = wordEnds.wordEnds("11111111", "22");
        String answer3 = wordEnds.wordEnds("qqqqwqwqwqwqw", "qqqqqqq");
        String answer4 = wordEnds.wordEnds("111111111111", "12");
        String answer5 = wordEnds.wordEnds("eeeeeeeeeeeeeeeee", "qwqwqw");
        String answer6 = wordEnds.wordEnds("HunterWarlock", "imp");
        String answer7 = wordEnds.wordEnds("Leather", "heat");

        //THEN
        assertEquals("", answer1);
        assertEquals("", answer2);
        assertEquals("", answer3);
        assertEquals("", answer4);
        assertEquals("", answer5);
        assertEquals("", answer6);
        assertEquals("", answer7);

    }
    @Test
    public void shouldTestTooLongWord () {
        //WHEN
        String answer1 = wordEnds.wordEnds("1", "132");
        String answer2 = wordEnds.wordEnds("Magic", "Hummer");
        String answer3 = wordEnds.wordEnds("Cast", "Priest");
        String answer4 = wordEnds.wordEnds("Death", "Resurrection");

        //THEN
        assertEquals("", answer1);
        assertEquals("", answer2);
        assertEquals("", answer3);
        assertEquals("", answer4);
    }
    @Test
    public void shouldTestWordOnTheEdge () {
        //WHEN
        String answer1 = wordEnds.wordEnds("PriestCasts", "Priest");
        String answer2 = wordEnds.wordEnds("HunterShoots", "Shoots");
        String answer3 = wordEnds.wordEnds("ManaNeedMana", "Mana");


        //THEN
        assertEquals("C", answer1);
        assertEquals("r", answer2);
        assertEquals("Nd", answer3);

    }
    @Test
    public void shouldTestWordAfterWord () {
        //WHEN
        String answer1 = wordEnds.wordEnds("ManaMana", "Mana");
        String answer2 = wordEnds.wordEnds("PurrPurrPurrPurr", "Purr");

        //THEN
        assertEquals("Ma", answer1);
        assertEquals("PrPrPr", answer2);

    }
    @Test
    public void shouldTestWordWithSeparators () {
        //WHEN
        String answer1 = wordEnds.wordEnds("PurrMeowPurr", "Purr");
        String answer2 = wordEnds.wordEnds("PurrEPurr", "Purr");
        String answer3 = wordEnds.wordEnds("PurrMeowPurrMeowPurr", "Purr");
        String answer4 = wordEnds.wordEnds("PurrIPurrIPurrI", "Purr");

        //THEN
        assertEquals("Mw", answer1);
        assertEquals("EE", answer2);
        assertEquals("MwMw", answer3);
        assertEquals("IIIII", answer4);

    }
}