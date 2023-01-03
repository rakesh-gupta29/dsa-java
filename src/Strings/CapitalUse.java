package Strings;

public class CapitalUse {
    public static void main(String[] args) {
        String str = "G";
        System.out.println(isCorrect(str));
    }

    public static boolean isCorrect(String word) {
        if (word.length() <= 1) return true;
        boolean ans = true;
        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))) {
                for (int i = 1; i < word.length(); i++) {
                    if (!Character.isUpperCase(word.charAt(i))) {
                        ans = false;
                        break;
                    }
                }
            } else {
                for (int i = 1; i < word.length(); i++) {
                    if (!Character.isLowerCase(word.charAt(i))) {
                        ans = false;
                        break;
                    }
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
