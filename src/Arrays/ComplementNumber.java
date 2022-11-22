package Arrays;

public class ComplementNumber {
    // incomplete questions
    public static void main(String[] args) {
        int target = 9 ;
        System.out.println(complement ( target));
    }
     public  static  int complement( int num) {
         var nBits = (int) Math.floor((Math.log(num) / Math.log(2)) + 1);
         var mask = (1 << nBits) ;
         System.out.println(mask);
         return ~num & mask;
     }

}