import java.util.Scanner;

import static java.lang.Math.max;
//Kadane’s Algorithm : Maximum Subarray Sum in an Array
//Problem Statement: Given an integer array arr, find the contiguous subarray
// (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.
public class KadanesAlgorithm {
    public static void maximumSubArraySum(int array[],int length){
        int sum=array[0];
        int maxSum=sum;
        for(int i=1;i<length;i++){
            sum=sum+array[i];
            if(sum<0){
                sum=0;
            }
            maxSum=max(maxSum,sum);
        }
        System.out.println(maxSum);
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
        KadanesAlgorithm.maximumSubArraySum(array,length);
    }
}
