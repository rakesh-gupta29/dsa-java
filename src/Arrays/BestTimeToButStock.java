package Arrays;

public class BestTimeToButStock {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit ( prices));
    }
    public  static  int maxProfit ( int [] prices   ) {
        if (prices.length == 0 ) return 0  ;
        int min = prices[0], profit = 0;
        for ( int price : prices ) {
            if( price < min ) {
                min = price;
            }
            if ( price - min > profit) {
                profit = price - min ;
            }
        }
        return profit;
    }
}
