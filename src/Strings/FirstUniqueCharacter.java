package Strings;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String target = "loveleetcode";
        System.out.println(firstIdx ( target));
    }
     public  static int firstIdx ( String target) {
        int len =  target.length() ;
         HashMap<Character,Integer> map = new HashMap<Character, Integer>();
         for ( char  character : target.toCharArray()) {
             map.put(character,map.getOrDefault(character,0) + 1 ) ;
         }
          for (  int i = 0 ; i < len; i++ ){
              if ( map.get(target.charAt(i)) == 1 ) {
                  return  i ;
              }
          }
          return -1 ;
     }
}
