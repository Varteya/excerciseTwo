import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckyOneThreeTest {

    //GIVEN
    LuckyOneThree luckyOneThree = new LuckyOneThree();

    @Test
    public void shouldTestNull() {
        //WHEN
        boolean answer = luckyOneThree.lucky13(null);

        //THEN
        assertTrue(answer);
    }

    @Test
    public void shouldTestVoidArray() {
        //WHEN
        boolean answer = luckyOneThree.lucky13(new int[]{});

        //THEN
        assertTrue(answer);
    }


    @Test
    public void shouldNotFoundOneOrThree() {
        //WHEN
        boolean answer1 = luckyOneThree.lucky13(new int[]{5, 4, 5, 6, 7, 8, 9, 0, 2});
        boolean answer2 = luckyOneThree.lucky13(new int[]{10, 11, 13, 36});
        boolean answer3 = luckyOneThree.lucky13(new int[]{1233});
        boolean answer4 = luckyOneThree.lucky13(new int[]{6772, 938883, 29992992, 323, 232, 321, 12333, 3312, 32});
        boolean answer5 = luckyOneThree.lucky13(new int[]{123, 323, 34, 432, 4, 5, 7, 8, 7, 7, 7, 7, 7, 7, 7});
        boolean answer6 = luckyOneThree.lucky13(new int[]{2});

        //THEN
        assertTrue(answer1);
        assertTrue(answer2);
        assertTrue(answer3);
        assertTrue(answer4);
        assertTrue(answer5);
        assertTrue(answer6);
    }

    @Test
    public void shouldFoundOneOrThree() {
        //WHEN
        boolean answer1 = luckyOneThree.lucky13(new int[]{1});
        boolean answer2 = luckyOneThree.lucky13(new int[]{3});
        boolean answer3 = luckyOneThree.lucky13(new int[]{5, 4, 5, 6, 7, 8, 9, 0, 2, 1});
        boolean answer4 = luckyOneThree.lucky13(new int[]{10, 11, 13, 36, 3});
        boolean answer5 = luckyOneThree.lucky13(new int[]{3, 1233});
        boolean answer6 = luckyOneThree.lucky13(new int[]{1, 6772, 938883, 29992992, 323, 232, 321, 12333, 3312, 32});
        boolean answer7 = luckyOneThree.lucky13(new int[]{123, 323, 1, 3, 3, 3, 3, 3, 1, 1, 34, 432, 4, 5, 7, 8, 7, 7, 7, 7, 7, 7, 7});

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