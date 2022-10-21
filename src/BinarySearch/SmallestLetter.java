package BinarySearch;

public class SmallestLetter {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};
        char  target='c';
        char  ans = getAns ( arr, target);
        System.out.println(ans);
    }
    static  char  getAns (  char [] arr, char target) {
        int start = 0;
        int end = arr.length -1 ;
        while ( start <= end ){
            int mid =  start + ( end - start ) /2 ;
            if ( arr[mid] <= target) {
                start = mid + 1;
            }else  {
                end = mid -1 ;
            }
        }
        return arr[start % arr.length] ; // since the array is rotated
    }
}
