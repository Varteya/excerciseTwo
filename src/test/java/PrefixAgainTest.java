import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixAgainTest {


    //GIVEN
    PrefixAgain prefixAgain = new PrefixAgain();

    @Test
    public void shouldTestVoidString () {
        //WHEN
        boolean answer = prefixAgain.prefixAgain("", 1);

        //THEN
        assertFalse(answer);
    }

    @Test
    public void shouldTestIncorrectLengthOfPrefix () {
        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("a", 0);
        boolean answer2 = prefixAgain.prefixAgain("a", -3);
        boolean answer3 = prefixAgain.prefixAgain("a", 3);

        //THEN
        assertFalse(answer1);
        assertFalse(answer2);
        assertFalse(answer3);

    }

    @Test
    public void shouldTestStringWithPrefixLength () {
        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("a", 1);
        boolean answer2 = prefixAgain.prefixAgain("aaa", 3);

        //THEN
        assertFalse(answer1);
        assertFalse(answer2);
    }

    @Test
    public void shouldTestPrefixAndPrefixJustAfterThat () {
        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("aa", 1);
        boolean answer2 = prefixAgain.prefixAgain("abab", 2);

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
    }

    @Test
    public void shouldTestRepeatingPrefixInLastPosition () {
        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("abbbba", 1);
        boolean answer2 = prefixAgain.prefixAgain("abbbsdbabbb", 4);

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);

    }

    @Test
    public void shouldFoundPrefixAgainInTHeMiddle () {
        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("ababa", 1);
        boolean answer2 = prefixAgain.prefixAgain("aaacccsaaacac", 3);
        boolean answer3 = prefixAgain.prefixAgain("assssas", 1);
        boolean answer4 = prefixAgain.prefixAgain("abbbbbbaa", 1);
        
        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
        assertTrue(answer3);
        assertTrue(answer4);
    }

    @Test
    public void shouldNotFoundPrefixAgain () {

        //WHEN
        boolean answer1 = prefixAgain.prefixAgain("assdfddffdfdfdff", 1);
        boolean answer2 = prefixAgain.prefixAgain("aaasdfffdsdffaa", 3);
        boolean answer3 = prefixAgain.prefixAgain("asdddffdfffdfdf", 1);
        boolean answer4 = prefixAgain.prefixAgain("abbbbbbabbssddssddss", 5);


        //THEN
        assertFalse(answer1);
        assertFalse(answer2);
        assertFalse(answer3);
        assertFalse(answer4);
    }

}