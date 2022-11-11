package Numbers;

public class TriFibonacci {
    public static void main(String[] args) {
        // https://leetcode.com/problems/n-th-tribonacci-number/
        int idx = 4;
        System.out.println(fib(idx));
    }


    public static int fib(int target) {
        if (target < 2  ) return target;

        int a = 0, b = 1,c =1 ;
        for (int i = 3 ; i <= target; i++) {
            int sum = a + b + c ;
            a = b;
            b=c ;
            c  = sum;
        }
        return c ;


    }

}
