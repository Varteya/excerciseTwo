import org.junit.Test;

import static org.junit.Assert.*;


public class GetSandwichTest {

    //GIVEN
    GetSandwich getSandwich = new GetSandwich();

    @Test(expected = IllegalArgumentException.class)
    public void shouldTestNullString () throws IllegalArgumentException {
        //WHEN
        String answer = getSandwich.getSandwich(null);

        //THEN
        fail("Expected IllegalArgumentException");
    }

    @Test
    public void shouldTestVoidString () {
        //WHEN
        String answer = getSandwich.getSandwich("");

        //THEN
        assertEquals("", answer);
    }

    @Test
    public void shouldTestStringWithoutBread () {
        //WHEN
        String answer1 = getSandwich.getSandwich("0");
        String answer2 = getSandwich.getSandwich("milk");
        String answer3 = getSandwich.getSandwich("break");
        String answer4 = getSandwich.getSandwich("Pepper");


        //THEN
        assertEquals("", answer1);
        assertEquals("", answer2);
        assertEquals("", answer3);
        assertEquals("", answer4);
    }

    @Test
    public void shouldTestOnePieceOfBread () {
        //WHEN
        String answer1 = getSandwich.getSandwich("bread");
        String answer2 = getSandwich.getSandwich("breakingbread");
        String answer3 = getSandwich.getSandwich("breadornot");
        String answer4 = getSandwich.getSandwich("wowbreadwow");

        //THEN
        assertEquals("", answer1);
        assertEquals("", answer2);
        assertEquals("", answer3);
        assertEquals("", answer4);
    }

    @Test
    public void shouldNotFindFilling () {
        //WHEN
        String answer1 = getSandwich.getSandwich("breadbread");
        String answer2 = getSandwich.getSandwich("breakingbreadbread");
        String answer3 = getSandwich.getSandwich("breadbreadbreeed");
        String answer4 = getSandwich.getSandwich("000breadbread00000");

        //THEN
        assertEquals("", answer1);
        assertEquals("", answer2);
        assertEquals("", answer3);
        assertEquals("", answer4);
    }

    @Test
    public void shouldFindFilling () {
        //WHEN
        String answer1 = getSandwich.getSandwich("breadbreadbread");
        String answer2 = getSandwich.getSandwich("breadJAMbread");
        String answer3 = getSandwich.getSandwich("EggbreadMeatAndSaladbread");
        String answer4 = getSandwich.getSandwich("bread1234brea23bread");
        String answer5 = getSandwich.getSandwich("breadORNOTTObreadbrea");
        String answer6 = getSandwich.getSandwich("breadKittybreadPuppy");
        String answer7 = getSandwich.getSandwich("123123123123bread breadsdfsdfhieruhjsdiuewr");
        String answer8 = getSandwich.getSandwich("breadbreadbreadbreadbreadbread");
        String answer9 = getSandwich.getSandwich("breadbeardbread");
        String answer10 = getSandwich.getSandwich("dskldsklsdklsdkldfsklbread090909bread");

        //THEN
        assertEquals("bread", answer1);
        assertEquals("JAM", answer2);
        assertEquals("MeatAndSalad", answer3);
        assertEquals("1234brea23", answer4);
        assertEquals("ORNOTTO", answer5);
        assertEquals("Kitty", answer6);
        assertEquals(" ", answer7);
        assertEquals("breadbreadbreadbread", answer8);
        assertEquals("beard", answer9);
        assertEquals("090909", answer10);
    }


}