package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,9,5,5};
        System.out.println(singleNumber( arr));
    }
     public  static  int singleNumber( int [] nums ) {
         int num = 0;

         for (int i : nums) {
             num =num ^ i;
         }
         return num;
     }
}
