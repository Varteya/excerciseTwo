import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckyOneThreeTest {

    @Test
    public void shouldReturnTrue(){

        //GIVEN
        LuckyOneThree luckyOneThree = new LuckyOneThree();

        //WHEN
        boolean answer1 = luckyOneThree.lucky13(new int[] {});
        boolean answer2 = luckyOneThree.lucky13(new int[] {2});
        boolean answer3 = luckyOneThree.lucky13(new int[] {5, 4, 5, 6, 7, 8, 9, 0, 2});
        boolean answer4 = luckyOneThree.lucky13(new int[] {10, 11, 13, 36});
        boolean answer5 = luckyOneThree.lucky13(new int[] {1233});
        boolean answer6 = luckyOneThree.lucky13(new int[] {6772, 938883, 29992992, 323, 232, 321, 12333, 3312, 32});
        boolean answer7 = luckyOneThree.lucky13(new int[] {123,323, 34, 432, 4, 5, 7, 8, 7, 7, 7, 7, 7, 7, 7});

        //THEN
        boolean expected = true;
        assertEquals(expected, answer1);
        assertEquals(expected, answer2);
        assertEquals(expected, answer3);
        assertEquals(expected, answer4);
        assertEquals(expected, answer5);
        assertEquals(expected, answer6);
        assertEquals(expected, answer7);
    }


    @Test
    public void shouldReturnFalse() {
        //GIVEN
        LuckyOneThree luckyOneThree = new LuckyOneThree();

        //WHEN
        boolean answer1 = luckyOneThree.lucky13(new int[] {1});
        boolean answer2 = luckyOneThree.lucky13(new int[] {3});
        boolean answer3 = luckyOneThree.lucky13(new int[] {5, 4, 5, 6, 7, 8, 9, 0, 2, 1});
        boolean answer4 = luckyOneThree.lucky13(new int[] {10, 11, 13, 36, 3});
        boolean answer5 = luckyOneThree.lucky13(new int[] {3, 1233});
        boolean answer6 = luckyOneThree.lucky13(new int[] {1, 6772, 938883, 29992992, 323, 232, 321, 12333, 3312, 32});
        boolean answer7 = luckyOneThree.lucky13(new int[] {123,323, 1, 3, 3, 3, 3, 3, 1, 1, 34, 432, 4, 5, 7, 8, 7, 7, 7, 7, 7, 7, 7});

        //THEN
        boolean expected = false;
        assertEquals(expected, answer1);
        assertEquals(expected, answer2);
        assertEquals(expected, answer3);
        assertEquals(expected, answer4);
        assertEquals(expected, answer5);
        assertEquals(expected, answer6);
        assertEquals(expected, answer7);
    }
}