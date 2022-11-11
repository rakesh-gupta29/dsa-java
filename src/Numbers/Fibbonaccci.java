package Numbers;

public class Fibbonaccci {
    public static void main(String[] args) {
        //https://leetcode.com/problems/fibonacci-number/
        int idx = 300;
        System.out.println(fib(idx));
    }


    public static int fib(int target) {
        if ( target  <  2 ) return target;
        int a = 0, b = 1;
        for (int i = 2; i <= target; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;


    }
}
