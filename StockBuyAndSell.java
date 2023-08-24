import java.util.Scanner;
//Problem Statement: You are given an array of prices where prices[i] is the price of a
// given stock on an ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and
// choosing a different day in the future to sell that stock. Return the maximum profit
// you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and
//sell on day 5 (price = 6), profit = 6-1 = 5.
//
//Note: That buying on day 2 and selling on day 1
//is not allowed because you must buy before
//you sell.
//
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are
//done and the max profit = 0.
public class StockBuyAndSell {
//    This is a brute force approach and it is not optimised
//    public static void buyAndSelProfit(int array[],int length){
//        int maxPro=0;
//        for (int j=0;j<length;j++) {
//                for (int i=j+1;i<length;i++) {
//                    if (array[i]>array[j]) {
//                        maxPro=Math.max(array[i]-array[j],maxPro);
//                }
//            }
//        }
//        System.out.println(maxPro);
//    }
    public static void buyAndSelProfit(int array[],int length){
        //this is the optimised aproach and timecomplexity of this approach is O(N)
        //space complexity is O(1)
        int maxProfit=0;
        int minProfit=Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            minProfit=Math.min(minProfit,array[i]);
            maxProfit=Math.max(maxProfit,array[i]-minProfit);
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array you want");
        int length=scanner.nextInt();
        int array[]=new int[length];
        System.out.println("Enter the elements for array");
        for(int i=0;i<length;i++){
            array[i]= scanner.nextInt();
        }
        StockBuyAndSell.buyAndSelProfit(array,length);
    }
}
