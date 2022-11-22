package Arrays;

public class SingleElement2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,1,2,9,5,5,5};
        System.out.println(singleNumber( arr));
    }
    public  static  int singleNumber( int [] nums ) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int sum = 0;
            for(int j = 0; j < nums.length; j++) {
                if(((nums[j] >> i) & 1) == 1) {
                    sum++;
                    sum %= 3;
                }
            }
            if(sum != 0) {
                ans |= sum << i;
            }
        }
        return ans;

    }

}
