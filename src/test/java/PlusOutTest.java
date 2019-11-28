import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOutTest {

    //GIVEN
    PlusOut plusOut = new PlusOut();

    @Test
    public void shouldTestNullString(){
        //WHEN
        String answer = plusOut.plusOut(null, "");

        //THEN
        assertNull(answer);
    }

    @Test
    public void shouldTestNullWord () {
        //WHEN
        String answer1 = plusOut.plusOut("", null);
        String answer2 = plusOut.plusOut("qweqwe", null);
        String answer3 = plusOut.plusOut("......", null);
        String answer4 = plusOut.plusOut("1234567", null);

        //THEN
        assertEquals("", answer1);
        assertEquals("++++++", answer2);
        assertEquals("++++++", answer3);
        assertEquals("+++++++", answer4);
    }

    @Test
    public void shouldTestEmptyWord () {
        //WHEN
        String answer = plusOut.plusOut("1234567890", "");

        //THEN
        assertEquals("++++++++++", answer);
    }

    @Test
    public void shouldTestWordLongerThanString () {
        //WHEN
        String answer1 = plusOut.plusOut("", "a");
        String answer2 = plusOut.plusOut("qweqwe", "aqweqwe");
        String answer3 = plusOut.plusOut("1", "11");
        String answer4 = plusOut.plusOut("123123123", "123123123123");
        String answer5 = plusOut.plusOut("0987654321", "qwertyuiopas");

        //THEN
        assertEquals("", answer1);
        assertEquals("++++++", answer2);
        assertEquals("+", answer3);
        assertEquals("+++++++++", answer4);
        assertEquals("++++++++++", answer5);
    }

    @Test
    public void shouldTestStringEqualsWord () {
        //WHEN
        String answer1 = plusOut.plusOut("asd", "asd");
        String answer2 = plusOut.plusOut("wasd", "wasd");
        String answer3 = plusOut.plusOut("", "");
        String answer4 = plusOut.plusOut("1234", "1234");
        String answer5 = plusOut.plusOut("!@#$%ˆˆ*()", "!@#$%ˆˆ*()");

        //THEN
        assertEquals("asd", answer1);
        assertEquals("wasd", answer2);
        assertEquals("", answer3);
        assertEquals("1234", answer4);
        assertEquals("!@#$%ˆˆ*()", answer5);
    }

    @Test
    public void shouldTestStringWithoutWordContains () {
        //WHEN
        String answer1 = plusOut.plusOut("1234567890", "asd");
        String answer2 = plusOut.plusOut("zxcvxbnznxmxkx", "asd");
        String answer3 = plusOut.plusOut("++", "asd");
        String answer4 = plusOut.plusOut("1234567874656555", "asd");
        String answer5 = plusOut.plusOut("1234567890", "a");
        String answer6 = plusOut.plusOut("qwqwqwqwqwqwqwqwqwqw", "asd");
        String answer7 = plusOut.plusOut("AAAAAAAAsd", "asd");
        String answer8 = plusOut.plusOut("aSdAsDasD", "asd");

        //THEN
        assertEquals("++++++++++", answer1);
        assertEquals("++++++++++++++", answer2);
        assertEquals("++", answer3);
        assertEquals("++++++++++++++++", answer4);
        assertEquals("++++++++++", answer5);
        assertEquals("++++++++++++++++++++", answer6);
        assertEquals("++++++++++", answer7);
        assertEquals("+++++++++", answer8);

    }

    @Test
    public void shouldFindWordAtTheEdgeOfString () {
        //WHEN
        String answer1 = plusOut.plusOut("asd1234567890", "asd");
        String answer2 = plusOut.plusOut("asd1234567890asd", "asd");
        String answer3 = plusOut.plusOut("a1234567890", "a");
        String answer4 = plusOut.plusOut("asd1234567890", "1234567890");
        String answer5 = plusOut.plusOut("asd1234567890as", "as");

        //THEN
        assertEquals("asd++++++++++", answer1);
        assertEquals("asd++++++++++asd", answer2);
        assertEquals("a++++++++++", answer3);
        assertEquals("+++1234567890", answer4);
        assertEquals("as+++++++++++as", answer5);

    }

    @Test
    public void shouldFindWordInTheMiddleOfTheString () {
        //WHEN
        String answer1 = plusOut.plusOut("12oooo12oooo12oo12", "o");
        String answer2 = plusOut.plusOut("12oooo12oooo12oo12", "oo");
        String answer3 = plusOut.plusOut("12oasoooas12ooasoo1as2asoo12", "as");
        String answer4 = plusOut.plusOut("as1fgh1ghg1hgh1s", "1");
        String answer5 = plusOut.plusOut("1ooo1ooo1ooo1ooo1", "ooo");

        //THEN
        assertEquals("++oooo++oooo++oo++", answer1);
        assertEquals("++oooo++oooo++oo++", answer2);
        assertEquals("+++as+++as++++as+++as+as++++", answer3);
        assertEquals("++1+++1+++1+++1+", answer4);
        assertEquals("+ooo+ooo+ooo+ooo+", answer5);
    }


}