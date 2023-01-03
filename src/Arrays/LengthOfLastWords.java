package Arrays;

public class LengthOfLastWords {
    public static void main(String[] args) {
        // https://leetcode.com/problems/length-of-last-word/
        String str = "Hello World";
        System.out.println(getLength(str));
        ;
    }

    public static int getLength(String str) {
        int len = 0, index = str.length() - 1;
        while (index >= 0) {
            if (str.charAt(index) != ' ') {
                len++;

            }
            if ( str.charAt(index) == ' ' &&  len > 0 ) return  len ;
            index--;
        }
        return len;
    }
}

