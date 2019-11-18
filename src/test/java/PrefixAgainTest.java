import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixAgainTest {

    @Test
    public void shouldTestExtremeValues () {
        //GIVEN
        PrefixAgain prefixAgain = new PrefixAgain();

        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("a", 1);
        boolean answer2 = prefixAgain.prefixAgain("aaa", 3);
        boolean answer3 = prefixAgain.prefixAgain("aa", 1);
        boolean answer4 = prefixAgain.prefixAgain("abbbbbba", 1);


        //THEN
        assertEquals(false, answer1);
        assertEquals(false, answer2);
        assertEquals(true, answer3);
        assertEquals(true, answer4);

    }


    @Test
    public void shouldReturnTrue () {
        //GIVEN
        PrefixAgain prefixAgain = new PrefixAgain();

        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("ababa", 1);
        boolean answer2 = prefixAgain.prefixAgain("aaacccsaaacac", 3);
        boolean answer3 = prefixAgain.prefixAgain("assssa", 1);
        boolean answer4 = prefixAgain.prefixAgain("abbbbbbaa", 1);


        //THEN
        assertEquals(true, answer1);
        assertEquals(true, answer2);
        assertEquals(true, answer3);
        assertEquals(true, answer4);
    }

    @Test
    public void shouldReturnFalse () {
        //GIVEN
        PrefixAgain prefixAgain = new PrefixAgain();

        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("assdfddffdfdfdff", 1);
        boolean answer2 = prefixAgain.prefixAgain("aaasdfffdsdffaa", 3);
        boolean answer3 = prefixAgain.prefixAgain("asdddffdfffdfdf", 1);
        boolean answer4 = prefixAgain.prefixAgain("abbbbbbabbssddssddss", 5);


        //THEN
        assertEquals(false, answer1);
        assertEquals(false, answer2);
        assertEquals(false, answer3);
        assertEquals(false, answer4);
    }

}