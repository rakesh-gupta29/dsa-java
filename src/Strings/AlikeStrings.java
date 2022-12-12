package Strings;
import java.util.Set;
public class AlikeStrings {
    public static void main(String[] args) {
        String s = "bookaaaaaaa";
        System.out.println(isEqual(s));
    }

    static boolean isEqual(String s) {

            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
            int vowelsCount = 0, midIndex = s.length() / 2;

            for (int i = 0; i < midIndex; i++) {
                char charA = s.charAt(i);
                char charB = s.charAt(midIndex + i);
                if (vowels.contains(charA)) vowelsCount++;
                if (vowels.contains(charB)) vowelsCount--;
            }
            return vowelsCount == 0;
    }
}
