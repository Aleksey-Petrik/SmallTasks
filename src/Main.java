import java.util.Arrays;

public class Main {

    //For Task 21.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3, 4}, 7)));
        System.out.println(reverse(321));
        System.out.println(isPalindrome(121));
        System.out.println(longestCommonPrefix(new String[]{"c", "acc", "ccc"}));
        //System.out.println(isValid("()"));

        //ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        //ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        //ListNode newList = mergeTwoLists(list1, list2);

        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));

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
    }//#1

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
    }//#7

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
    }//#9

    /*  Task 14. Longest Common Prefix. https://leetcode.com
        Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".
     */
    public static String longestCommonPrefix(String[] strs) {
        String pattern = strs[0];
        //Поиск самого короткого слова для шаблона
        for (String word : strs) {
            if (pattern.length() > word.length()) {
                pattern = word;
            }
        }
        while (!pattern.isEmpty()) {
            boolean isFind = true;
            for (String word : strs) {
                if (!word.startsWith(pattern)) {
                    isFind = false;
                    break;
                }
            }
            if (!isFind) {
                pattern = pattern.substring(0, pattern.length() - 1);
            } else {
                break;
            }
        }
        return pattern;
    }//#14

    /*  Task 20. Valid Parentheses. https://leetcode.com
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
     */
    public static boolean isValid(String s) {
        char[] symbols = s.toCharArray();
        int i = 0;
        while (true) {
            if (symbols[i] == symbols[i + 1] ||
                    symbols[i] == symbols[symbols.length - (i + 1)]) {
                System.out.println("ok");
            }
            i++;
        }
        //return true;
    }//#20

    /* Task 21. Merge Two Sorted Lists. https://leetcode.com
    Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

    Input: l1 = [1,2,4], l2 = [1,3,4]
    Output: [1,1,2,3,4,4]
    Input: l1 = [], l2 = []
    Output: []
    Input: l1 = [], l2 = [0]
    Output: [0]
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = null;
        while (true) {
            int val1 = l1.val;
            int val2 = l2.val;

            if (val1 >= val2) {
                if (list == null) {
                    list = new ListNode(val1, new ListNode(val2));
                } else {
                    list.next = new ListNode(val1, new ListNode(val2));
                }

                //list.next = new ListNode(l2.val, new ListNode(l1.val));
            } else {
                if (list == null) {
                    list = new ListNode(val2, new ListNode(val1));
                } else {
                    list.next = new ListNode(val2, new ListNode(val1));
                }
                // list.next = new ListNode(l1.val, new ListNode(l2.val));
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        //return new ListNode(1);
    }//#21

    /*  Task 66 Plus One. https://leetcode.com
        Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
        You may assume the integer does not contain any leading zero, except the number 0 itself.

        Input: digits = [1,2,3]
        Output: [1,2,4]

        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
     */
    public static int[] plusOne(int[] digits) {
        int one = 1;
        for (int i = digits.length - 1; i >= 0 && one != 0; i--) {
            int sum = digits[i] + one;
            digits[i] = sum % 10;
            one = sum / 10;
        }

        if (one == 1) {
            int[] newDigits = new int[digits.length + 1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = one;
            return newDigits;
        }
        return digits;
    }//#66
}