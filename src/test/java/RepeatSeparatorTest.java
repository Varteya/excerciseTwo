import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatSeparatorTest {

    //GIVEN
    RepeatSeparator repeatSeparator = new RepeatSeparator();

    @Test(expected = IllegalArgumentException.class)
    public void shouldTestNullWord() {
        //WHEN
        String answer = repeatSeparator.repeatSeparator(null, "sd", 4);

        //THEN
        fail("Expected IllegalArgumentException");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTestNullSeparator() {
        //WHEN
        String answer = repeatSeparator.repeatSeparator("sdsdsd", null, 4);

        //THEN
        fail("Expected IllegalArgumentException");
    }

    @Test
    public void shouldTestIncorrectCounter() {
        //WHEN
        String answer = repeatSeparator.repeatSeparator("double", "float", -5);

        //THEN
        assertEquals("", answer);
    }

    @Test
    public void shouldReturnEmptyString() {
        //WHEN
        String answer1 = repeatSeparator.repeatSeparator("This", "And", 0);
        String answer2 = repeatSeparator.repeatSeparator("", "", 1);
        String answer3 = repeatSeparator.repeatSeparator("", "", 0);
        String answer4 = repeatSeparator.repeatSeparator("", "sdfaaffd", 1);
        String answer5 = repeatSeparator.repeatSeparator("", "", 100);

        //THEN
        String expected = "";
        assertEquals(expected, answer1);
        assertEquals(expected, answer2);
        assertEquals(expected, answer3);
        assertEquals(expected, answer4);
        assertEquals(expected, answer5);
    }

    @Test
    public void shouldReturnOneWordWithoutSeparator() {
        //WHEN
        String answer1 = repeatSeparator.repeatSeparator("This", "And", 1);
        String answer2 = repeatSeparator.repeatSeparator("123Hell", "And", 1);
        String answer3 = repeatSeparator.repeatSeparator("%ˆˆ*Heaven", "And", 1);

        //THEN
        assertEquals("This", answer1);
        assertEquals("123Hell", answer2);
        assertEquals("%ˆˆ*Heaven", answer3);
    }

    @Test
    public void shouldReturnTwoRepeats() {
        //WHEN
        String answer1 = repeatSeparator.repeatSeparator("This", "And", 2);
        String answer2 = repeatSeparator.repeatSeparator("This", "", 2);
        String answer3 = repeatSeparator.repeatSeparator("And", "And", 2);
        String answer4 = repeatSeparator.repeatSeparator("", "And", 2);
        String answer5 = repeatSeparator.repeatSeparator("ThisThis", "a", 2);

        //THEN
        assertEquals("ThisAndThis", answer1);
        assertEquals("ThisThis", answer2);
        assertEquals("AndAndAnd", answer3);
        assertEquals("And", answer4);
        assertEquals("ThisThisaThisThis", answer5);
    }

    @Test
    public void shouldReturnManyRepeats() {
        //WHEN
        String answer1 = repeatSeparator.repeatSeparator("This", "And", 5);
        String answer2 = repeatSeparator.repeatSeparator("Program", "Is", 7);
        String answer3 = repeatSeparator.repeatSeparator("", "*", 4);
        String answer4 = repeatSeparator.repeatSeparator("$nake$", "oh", 10);


        //THEN
        assertEquals("ThisAndThisAndThisAndThisAndThis", answer1);
        assertEquals("ProgramIsProgramIsProgramIsProgramIsProgramIsProgramIsProgram", answer2);
        assertEquals("***", answer3);
        assertEquals("$nake$oh$nake$oh$nake$oh$nake$oh$nake$oh$nake$oh$nake$oh$nake$oh$nake$oh$nake$", answer4);
    }

}