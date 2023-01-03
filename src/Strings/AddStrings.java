package Strings;

public class AddStrings {
    public static void main(String[] args) {
        // https://leetcode.com/problems/add-strings/
        String num1 = "0", num2 = "0";
        System.out.println(sum(num1, num2));
    }

    public static String sum(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0'; // conversion to int
            if (j >= 0) sum += b.charAt(j--) - '0';
            ans.append(sum % 10);
            carry = sum / 10;
        }
        if ( carry != 0 ) ans.append(carry) ;
        return ans.reverse().toString();
    }
}
