package Arrays;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        getAns(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void getAns(int[] nums) {
        int moveLeft = 0;
        int pointer = 0;
        while (pointer < nums.length) {
            if (nums[pointer] == 0) {
                moveLeft++;
            }
            if (moveLeft != 0 && nums[pointer] != 0) {
                nums[pointer - moveLeft] = nums[pointer];
                nums[pointer] = 0;
            }
            pointer++;
        }

    }


}
