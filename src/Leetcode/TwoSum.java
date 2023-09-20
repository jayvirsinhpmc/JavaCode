package Leetcode;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[3];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twosumobj = new TwoSum();

        int[] nums = {1,2,3,4,6};
        int target = 5;

        twosumobj.twoSum(nums, target);
    }
}