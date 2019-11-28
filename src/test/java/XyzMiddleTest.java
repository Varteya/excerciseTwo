import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XyzMiddleTest {

    //GIVEN
    XyzMiddle xyzMiddle = new XyzMiddle();

    @Test
    public void shouldTestNull () {
        //WHEN
        boolean answer = xyzMiddle.xyzMiddle(null);

        //THEN
        assertFalse(answer);
    }
    @Test
    public void shouldTestEmptyString () {
        //WHEN
        boolean answer = xyzMiddle.xyzMiddle("");

        //THEN
        assertFalse(answer);
    }

    @Test
    public void shouldTestShortString () {
        //WHEN
        boolean answer1 = xyzMiddle.xyzMiddle("xy");
        boolean answer2 = xyzMiddle.xyzMiddle("xz");
        boolean answer3 = xyzMiddle.xyzMiddle("x");
        boolean answer4 = xyzMiddle.xyzMiddle("as");
        boolean answer5 = xyzMiddle.xyzMiddle("fd");
        boolean answer6 = xyzMiddle.xyzMiddle("yz");
        boolean answer7 = xyzMiddle.xyzMiddle("d");

        //THEN
        assertFalse(answer1);
        assertFalse(answer2);
        assertFalse(answer3);
        assertFalse(answer4);
        assertFalse(answer5);
        assertFalse(answer6);
        assertFalse(answer7);
    }

    @Test
    public void shouldFoundXYZInTheMiddleOfOddLengthString () {
        //WHEN
        boolean answer1 = xyzMiddle.xyzMiddle("xyz");
        boolean answer2 = xyzMiddle.xyzMiddle("AxyzA");
        boolean answer3 = xyzMiddle.xyzMiddle("ssxyzss");
        boolean answer4 = xyzMiddle.xyzMiddle("asdxyzdfg");
        boolean answer5 = xyzMiddle.xyzMiddle("WWxyzCC");
        boolean answer6 = xyzMiddle.xyzMiddle("123123xyz456456");
        boolean answer7 = xyzMiddle.xyzMiddle("78xyz87");
        boolean answer8 = xyzMiddle.xyzMiddle("sdfsdfxyzghjghj");

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
        assertTrue(answer3);
        assertTrue(answer4);
        assertTrue(answer5);
        assertTrue(answer6);
        assertTrue(answer7);
        assertTrue(answer8);
    }

    @Test
    public void shouldFoundXYZAtLeftSideOfEvenLengthString () {
        //WHEN
        boolean answer1 = xyzMiddle.xyzMiddle("xyzz");
        boolean answer2 = xyzMiddle.xyzMiddle("axyzza");
        boolean answer3 = xyzMiddle.xyzMiddle("sdfxyzdfsz");
        boolean answer4 = xyzMiddle.xyzMiddle("123xyz1234");
        boolean answer5 = xyzMiddle.xyzMiddle("AAAAAxyzAAAAAA");
        boolean answer6 = xyzMiddle.xyzMiddle("ASAxyzASAS");
        boolean answer7 = xyzMiddle.xyzMiddle("111xyz1111");
        boolean answer8 = xyzMiddle.xyzMiddle("...xyz....");

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
        assertTrue(answer3);
        assertTrue(answer4);
        assertTrue(answer5);
        assertTrue(answer6);
        assertTrue(answer7);
        assertTrue(answer8);
    }

    @Test
    public void shouldFoundXYZAtRightSideOfEvenLengthString () {
        //WHEN
        boolean answer1 = xyzMiddle.xyzMiddle("AAxyzA");
        boolean answer2 = xyzMiddle.xyzMiddle("1xyz");
        boolean answer3 = xyzMiddle.xyzMiddle("123xyz12");
        boolean answer4 = xyzMiddle.xyzMiddle("asdfxyzasd");
        boolean answer5 = xyzMiddle.xyzMiddle("....xyz...");
        boolean answer6 = xyzMiddle.xyzMiddle("POPOPOxyzPOPOP");
        boolean answer7 = xyzMiddle.xyzMiddle("xyzxyzxy");
        boolean answer8 = xyzMiddle.xyzMiddle("XXxyzX");

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
        assertTrue(answer3);
        assertTrue(answer4);
        assertTrue(answer5);
        assertTrue(answer6);
        assertTrue(answer7);
        assertTrue(answer8);
    }

    @Test
    public void shouldNotFoundXYZInTheMiddle () {
        //WHEN
        boolean answer1 = xyzMiddle.xyzMiddle("qwe");
        boolean answer2 = xyzMiddle.xyzMiddle("qwexyz");
        boolean answer3 = xyzMiddle.xyzMiddle("qwqxyze");
        boolean answer4 = xyzMiddle.xyzMiddle("11xyz");
        boolean answer5 = xyzMiddle.xyzMiddle("1111xyz11");
        boolean answer6 = xyzMiddle.xyzMiddle("xyz1111");
        boolean answer7 = xyzMiddle.xyzMiddle("xyz11");

        //THEN
        assertFalse(answer1);
        assertFalse(answer2);
        assertFalse(answer3);
        assertFalse(answer4);
        assertFalse(answer5);
        assertFalse(answer6);
        assertFalse(answer7);
    }


}