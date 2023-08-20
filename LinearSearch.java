import javax.sound.sampled.Line;
import java.util.Scanner;

public class LinearSearch {
    public static void search(int array[],int length,int num){
        for(int i=0;i<length;i++){
            if(array[i]==num){
                System.out.println("Given number is found at ::"+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=scanner.nextInt();
        int array[]=new int[length];
        System.out.println("Enter the elements for array");
        for(int i=0;i<length;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("Enter the number you need to search");
        int num=scanner.nextInt();
        LinearSearch.search(array,length,num);
    }
}
