//Given a non-empty array of ints, return a new array containing the elements from the
//original array that come before the first 4 in the original array. The original array
//will contain at least one 4. Note that it is valid in java to create an array of length 0.
//
//        pre4([1, 2, 4, 1]) → [1, 2]
//        pre4([3, 1, 4]) → [3, 1]
//        pre4([1, 4, 4]) → [1]


public class PreFour {

    public static void main(String[] args) {
        PreFour preFour = new PreFour();
        int[] answer = preFour.pre4(new int[]{1, 2, 4, 1});
        System.out.println(answer);
    }

    public int[] pre4(int[] nums) {
        if (nums == null) {
            return null;
        }
        if (nums.length == 0) {
            return nums;
        }
        int fourIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                fourIndex = i;
                break;
            }
        }
        if (fourIndex == -1) {
            return new int[]{};
        }
        int[] answer = new int[fourIndex];
        for (int i = 0; i < fourIndex; i++) {
            answer[i] = nums[i];
        }
        return answer;
    }
}
