

import java.util.Scanner;

public class LongestSubarray {

    //Problem Statement: Given an array and a sum k, we need to print the length of the longest
// subarray that sums to k.
    public static int subArraySum(int array[],int length,int k){
        int i=0;
        int sum=0;
        int maxLen=0;
        int len=0;
        while (i<length){
            int j=i;
            while(j<length){
                sum=sum+array[j];
                if(sum==k){
                    len=j-i;
                    maxLen=Math.max(maxLen,len);
                }
                if(sum>k){
                    sum=0;
                }
                if(maxLen<len){
                    maxLen=len;
                }
                j++;
            }
            i++;
            return maxLen+1;
        }
        return -1;
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
        System.out.println("Enter the K value");
        int k=scanner.nextInt();
        System.out.println(LongestSubarray.subArraySum(array, length, k));
    }
}
