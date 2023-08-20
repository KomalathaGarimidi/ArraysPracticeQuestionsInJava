import java.util.Scanner;

public class FindMissingNumberInAnArray {
    public static void missingNumber(int array[],int N){
        int sum=(N*(N+1))/2;
        int summation=0;
        for(int i=0;i<N;i++){
            summation=summation+array[i];
        }
        int value=summation-sum;
        System.out.println(value);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the No of elements");
        int N=scanner.nextInt();
        int array[]=new int[N];
        System.out.println("Enter the elements for array");
        for(int i=0;i<N;i++){
            array[i]= scanner.nextInt();
        }
        FindMissingNumberInAnArray.missingNumber(array,N-1);
    }
}
