import org.junit.Test;

import static org.junit.Assert.*;

public class PreFourTest {

    //GIVEN
    PreFour preFour = new PreFour();

    @Test (expected = IllegalArgumentException.class)
    public void shouldTestNull () {
        //WHEN
        int[] answer = preFour.pre4(null);

        //THEN
        fail("Expected IllegalArgumentException");
    }

    @Test
    public void shouldTestEmptyArray () {
        //WHEN
        int[] answer = preFour.pre4(new int[] {});

        //THEN
        assertArrayEquals(new int[]{}, answer);
    }
    @Test
    public void shouldNotFoundFour () {
        //WHEN
        int[] answer1 = preFour.pre4(new int[] {1, 1});
        int[] answer2 = preFour.pre4(new int[] {1, 2, 3, 1, 3, 2});
        int[] answer3 = preFour.pre4(new int[] {2, 2, 2, 2, 2});
        int[] answer4 = preFour.pre4(new int[] {0, 1, 2, 43, 42, 14, 45});
        int[] answer5 = preFour.pre4(new int[] {76, 43, 22, 2, 5});
        int[] answer6 = preFour.pre4(new int[] {54, 2, 3, 1, 5});

        //THEN
        assertArrayEquals(new int[]{}, answer1);
        assertArrayEquals(new int[]{}, answer2);
        assertArrayEquals(new int[]{}, answer3);
        assertArrayEquals(new int[]{}, answer4);
        assertArrayEquals(new int[]{}, answer5);
        assertArrayEquals(new int[]{}, answer6);
    }
    @Test
    public void shouldFoundFour () {
        //WHEN
        int[] answer1 = preFour.pre4(new int[] {1, 1, 4});
        int[] answer2 = preFour.pre4(new int[] {4});
        int[] answer3 = preFour.pre4(new int[] {1, 4, 4, 3});
        int[] answer4 = preFour.pre4(new int[] {1, 1, 2, 4, 5, 5, 5, 6});
        int[] answer5 = preFour.pre4(new int[] {1, 4, 4, 1});
        int[] answer6 = preFour.pre4(new int[] {0, 1, 2, 3, 4, 5});
        int[] answer7 = preFour.pre4(new int[] {10, 14, 44, 4});
        int[] answer8 = preFour.pre4(new int[] {4, 5, 5, 6, 4, 6, 3, 6, 5});
        int[] answer9 = preFour.pre4(new int[] {1, 11111223, 41241232, 4532, 222222222, 4});
        int[] answer10 = preFour.pre4(new int[] {1, 1234, 242342, 3434, 4, 343, 343, 545435, 454245, 234});
        int[] answer11 = preFour.pre4(new int[] {1, 1, 23, 4, 234, 3, 5, 4, 5, 4, 53, 4, 7});

        //THEN
        assertArrayEquals(new int[] {1, 1}, answer1);
        assertArrayEquals(new int[] {}, answer2);
        assertArrayEquals(new int[] {1}, answer3);
        assertArrayEquals(new int[] {1, 1, 2}, answer4);
        assertArrayEquals(new int[] {1}, answer5);
        assertArrayEquals(new int[] {0, 1, 2, 3}, answer6);
        assertArrayEquals(new int[] {10, 14, 44}, answer7);
        assertArrayEquals(new int[] {}, answer8);
        assertArrayEquals(new int[] {1, 11111223, 41241232, 4532, 222222222}, answer9);
        assertArrayEquals(new int[] {1, 1234, 242342, 3434}, answer10);
        assertArrayEquals(new int[] {1, 1, 23}, answer11);

    }

}