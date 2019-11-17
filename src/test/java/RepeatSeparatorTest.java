import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatSeparatorTest {

    @Test
    public void shouldReturnThis() {
        //GIVEN
        RepeatSeparator repeatSeparator = new RepeatSeparator();

        //WHEN
        String answer = repeatSeparator.repeatSeparator("This", "And", 1);

        //THEN
        String expected = "This";
        assertEquals(expected, answer);

    }

    @Test
    public void shouldReturnEmptyString(){

        //GIVEN
        RepeatSeparator repeatSeparator = new RepeatSeparator();

        //WHEN
        String answer1 = repeatSeparator.repeatSeparator("This", "And", 0);
        String answer2 = repeatSeparator.repeatSeparator("", "", 1);
        String answer3 = repeatSeparator.repeatSeparator("", "", 100);


        //THEN
        String expected = "";
        assertEquals(expected, answer1);
        assertEquals(expected, answer2);
        assertEquals(expected, answer3);

    }

    @Test
    public void shouldReturnTwoRepeats() {
        //GIVEN
        RepeatSeparator repeatSeparator = new RepeatSeparator();

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
    public void shouldReturnOneRepeat() {
        //GIVEN
        RepeatSeparator repeatSeparator = new RepeatSeparator();

        //WHEN
        String answer1 = repeatSeparator.repeatSeparator("You", "Ten", 1);
        String answer2 = repeatSeparator.repeatSeparator("Are", "Thousand", 1);
        String answer3 = repeatSeparator.repeatSeparator("Not", "Years", 1);
        String answer4 = repeatSeparator.repeatSeparator("Prepared", "", 1);
        String answer5 = repeatSeparator.repeatSeparator("!!!", "Stormrage", 1);

        //THEN
        assertEquals("You", answer1);
        assertEquals("Are", answer2);
        assertEquals("Not", answer3);
        assertEquals("Prepared", answer4);
        assertEquals("!!!", answer5);
    }

}