package Searching;

public class LinearArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90};
        int target = 70;
        int idx =  search (  arr, target);
        System.out.println(idx );
    }
    static  int search (int  [] arr , int target) {
        if (arr.length == 0 ) {
            return -1;
        }
        int len = arr.length ;
        for ( int i =0 ; i< len -1 ;i++) {
            if (arr[i] ==  target) {
                return i;
            }
        }
        return  -1;
    }
}
