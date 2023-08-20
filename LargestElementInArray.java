import java.util.Scanner;

public class LargestElementInArray {
    public static void largest(int array[],int length){
        int max=0;
        for(int i=0;i<length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max element in the given array is "+max);
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
        LargestElementInArray.largest(array,length);
    }
}
