package Strings;

public class Repeatedpattern {
    public static void main(String[] args) {
        // https://leetcode.com/problems/repeated-substring-pattern/
        String str = "abaababaab";
        System.out.println(isRepeated(str));
    }

    public static boolean isRepeated(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.length() % i == 0) {
                // pick next i elements
                String pattern = str.substring(0, i);
                int j = i;
                while (j < str.length() && str.substring(j, j + i).equals(pattern)) {
                    j += i;
                }
                if (j == str.length()) {
                    return true;
                }

            }
        }
        return false;
    }

}
