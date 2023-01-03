package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // https://leetcode.com/problems/longest-common-prefix/
        String[] arr = {"dog","racecar","car"};
        System.out.println(longestPrefix(arr));
    }

    public static String longestPrefix(String[] arr) {
        // finding the smallest word
        String min = arr[0];
        for (String elem : arr) {
            if (elem.length() < min.length()) {
                min = elem;
            }
        }
        for (String elem : arr) {
            while (!elem.startsWith(min)) {
                min = min.substring(0, min.length() - 1);
            }
        }
        return min;

    }
}
