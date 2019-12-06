import org.junit.Test;

import static org.junit.Assert.*;

public class UnluckyOneTest {
    //GIVEN
    UnluckyOne unluckyOne = new UnluckyOne();

    @Test(expected = IllegalArgumentException.class)
    public void shouldTestNullArray() {
        //WHEN
        boolean answer = unluckyOne.unlucky1(null);

        //THEN
        fail("Expected IllegalArgumentException");
    }

    @Test
    public void shouldTestEmptyArray() {
        //WHEN
        boolean answer = unluckyOne.unlucky1(new int[]{});

        //THEN
        assertFalse(answer);
    }

    @Test
    public void shouldTestNoThreeAndOneInLastPosition() {
        //WHEN
        boolean answer1 = unluckyOne.unlucky1(new int[]{1});
        boolean answer2 = unluckyOne.unlucky1(new int[]{2, 1});
        boolean answer3 = unluckyOne.unlucky1(new int[]{1, 1, 1});
        boolean answer4 = unluckyOne.unlucky1(new int[]{1, 1});
        boolean answer5 = unluckyOne.unlucky1(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        boolean answer6 = unluckyOne.unlucky1(new int[]{6, 6, 6, 6, 6, 6, 1});
        boolean answer7 = unluckyOne.unlucky1(new int[]{6, 6, 6, 6, 6, 6, 1, 1, 1, 1});

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
    public void shouldTestOneAndTheeOnTheEdge() {
        //WHEN
        boolean answer1 = unluckyOne.unlucky1(new int[]{1, 3});
        boolean answer2 = unluckyOne.unlucky1(new int[]{1, 1, 3});
        boolean answer3 = unluckyOne.unlucky1(new int[]{1, 3, 3, 3, 2, 42, 5});
        boolean answer4 = unluckyOne.unlucky1(new int[]{1, 3, 3, 3, 2, 42, 5});
        boolean answer5 = unluckyOne.unlucky1(new int[]{1, 2, 3, 3, 3, 2, 1, 3});

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
        assertTrue(answer3);
        assertTrue(answer4);
        assertTrue(answer5);
    }

    @Test
    public void shouldFoundThreeImmediatelyAfterOne() {
        //WHEN
        boolean answer1 = unluckyOne.unlucky1(new int[]{1, 3});
        boolean answer2 = unluckyOne.unlucky1(new int[]{1, 1, 3});
        boolean answer3 = unluckyOne.unlucky1(new int[]{1, 3, 3, 1, 3});
        boolean answer4 = unluckyOne.unlucky1(new int[]{1, 1, 1, 2, 1, 3});
        boolean answer5 = unluckyOne.unlucky1(new int[]{1, 4, 4, 5, 6, 7, 8, 9, 10, 1, 3});
        boolean answer6 = unluckyOne.unlucky1(new int[]{14, 1, 3, 2, 2, 1});

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
        assertTrue(answer3);
        assertTrue(answer4);
        assertTrue(answer5);
        assertTrue(answer6);
    }

    @Test
    public void shouldNotFoundThreeImmediatelyAfterOne() {
        //WHEN
        boolean answer1 = unluckyOne.unlucky1(new int[]{1, 4});
        boolean answer2 = unluckyOne.unlucky1(new int[]{1, 2, 3});
        boolean answer3 = unluckyOne.unlucky1(new int[]{1, 2, 3, 13, 3});
        boolean answer4 = unluckyOne.unlucky1(new int[]{1, 1, 1, 3, 1, 2});
        boolean answer5 = unluckyOne.unlucky1(new int[]{13, 13, 4, 5, 6, 7, 8, 9, 10, 1, 0});
        boolean answer6 = unluckyOne.unlucky1(new int[]{14, 1, 4, 2, 2, 1});

        //THEN
        assertFalse(answer1);
        assertFalse(answer2);
        assertFalse(answer3);
        assertFalse(answer4);
        assertFalse(answer5);
        assertFalse(answer6);
    }
}