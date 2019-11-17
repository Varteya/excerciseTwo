import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnluckyOneTest {

    @Test
    public void shouldTestExtremeValues () {
        //GIVEN
        UnluckyOne unluckyOne = new UnluckyOne();

        //WHEN
        boolean answer1 = unluckyOne.unlucky1(new int[]{});
        boolean answer2 = unluckyOne.unlucky1(new int[]{1});
        boolean answer3 = unluckyOne.unlucky1(new int[]{1, 3});
        boolean answer4 = unluckyOne.unlucky1(new int[]{1, 1});
        boolean answer5 = unluckyOne.unlucky1(new int[]{1, 1, 3});
        boolean answer6 = unluckyOne.unlucky1(new int[]{1, 1, 1});

        //THEN
        assertEquals(false, answer1);
        assertEquals(false, answer2);
        assertEquals(true, answer3);
        assertEquals(false, answer4);
        assertEquals(true, answer5);
        assertEquals(false, answer6);
    }

    @Test
    public void shouldReturnTrue () {
        //GIVEN
        UnluckyOne unluckyOne = new UnluckyOne();

        //WHEN
        boolean answer1 = unluckyOne.unlucky1(new int[]{1, 3});
        boolean answer2 = unluckyOne.unlucky1(new int[]{1, 1, 3});
        boolean answer3 = unluckyOne.unlucky1(new int[]{1, 3, 3, 1, 3});
        boolean answer4 = unluckyOne.unlucky1(new int[]{1, 1, 1, 2, 1, 3});
        boolean answer5 = unluckyOne.unlucky1(new int[]{1, 4, 4, 5, 6, 7, 8, 9, 10, 1, 3});
        boolean answer6 = unluckyOne.unlucky1(new int[]{14, 1, 3, 2, 2, 1});

        //THEN
        assertEquals(true, answer1);
        assertEquals(true, answer2);
        assertEquals(true, answer3);
        assertEquals(true, answer4);
        assertEquals(true, answer5);
        assertEquals(true, answer6);
    }
    @Test
    public void shouldReturnFalse () {
        //GIVEN
        UnluckyOne unluckyOne = new UnluckyOne();

        //WHEN
        boolean answer1 = unluckyOne.unlucky1(new int[]{1, 4});
        boolean answer2 = unluckyOne.unlucky1(new int[]{1, 2, 3});
        boolean answer3 = unluckyOne.unlucky1(new int[]{1, 2, 3, 13, 3});
        boolean answer4 = unluckyOne.unlucky1(new int[]{1, 1, 1, 3, 1, 2});
        boolean answer5 = unluckyOne.unlucky1(new int[]{13, 13, 4, 5, 6, 7, 8, 9, 10, 1, 0});
        boolean answer6 = unluckyOne.unlucky1(new int[]{14, 1, 4, 2, 2, 1});

        //THEN
        assertEquals(false, answer1);
        assertEquals(false, answer2);
        assertEquals(false, answer3);
        assertEquals(false, answer4);
        assertEquals(false, answer5);
        assertEquals(false, answer6);
    }
}