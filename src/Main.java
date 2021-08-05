import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3, 4}, 7)));
        System.out.println(reverse(321));
        System.out.println(isPalindrome(121));
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
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /*  Task 7. Reverse Integer. https://leetcode.com
        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

        Input: x = 123
        Output: 321

        Input: x = -123
        Output: -321
     */
    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int y = x % 10;
            result = result * 10 + y;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }

    /*  Task 9. Palindrome Number. https://leetcode.com
        Given an integer x, return true if x is palindrome integer.
        An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

        Input: x = 121
        Output: true

        Input: x = 10
        Output: false
     */
    public static boolean isPalindrome(int x) {
        int result = 0;
        int tmpX = x;
        while (tmpX > 0) {
            int y = tmpX % 10;
            result = result * 10 + y;
            tmpX = tmpX / 10;
        }
        return x == result;
    }
}
