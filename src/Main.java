import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    /*
        Task 1. Two Sum. https://leetcode.com
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
