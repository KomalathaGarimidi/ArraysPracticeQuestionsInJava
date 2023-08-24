import java.util.Scanner;
//Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one.
// Find that single one.
public class ContOfNumberAppereance {
    public static int appereance(int array[],int length){
        int temp[]=new int[10];
        for (int i=0;i<length;i++) {
            temp[array[i]]++ ;
        }
        for(int i=0;i< temp.length;i++){
            if (temp[array[i]]==1) {
                return array[i];
            }
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
        System.out.println(ContOfNumberAppereance.appereance(array, length));
    }
}
