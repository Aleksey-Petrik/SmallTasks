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
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(removeDuplicates(new int[]{0, 1}));

        System.out.println(strStr("mississippi", "issip"));
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

    /*  Task 26  Remove Duplicates from Sorted Array. https://leetcode.com
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same.
    Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
    More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
    It does not matter what you leave beyond the first k elements.
    Return k after placing the final result in the first k slots of nums.
    Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     */
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }//#26

    /*  Task 27 Remove Element. https://leetcode.com
        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
        Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
        More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
        It does not matter what you leave beyond the first k elements.
        Return k after placing the final result in the first k slots of nums.
        Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
     */
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }//#27

    /*  Task 28. Implement strStr(). https://leetcode.com
        Implement strStr().
        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
        Clarification:
        What should we return when needle is an empty string? This is a great question to ask during an interview.
        For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
     */
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }
        char[]strLine = haystack.toCharArray();
        char[]strSearch = needle.toCharArray();
        int index = 0;
        for(int i = 0; i < strLine.length; i++ ){
            if (strLine[i] == strSearch[index]) {
                if (index == strSearch.length - 1){
                    return i - index;
                }
                index++;
            } else {
                if (index != 0) {
                    i -= index;
                }
                index = 0;
            }
        }

        return -1;
    }//#28

    /*  Task 28. Implement strStr(). https://leetcode.com
        Implement strStr().
        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
        Clarification:
        What should we return when needle is an empty string? This is a great question to ask during an interview.
        For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
     */
    public static int strStr_2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }//#28

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