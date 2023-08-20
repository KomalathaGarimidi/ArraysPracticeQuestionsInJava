import java.util.Scanner;

public class CheckSortedOrNot {
    public static void checkSorted(int array[],int length){
        boolean flag=true;

        for(int i=0;i<length-1;i++){
            if(array[i]>array[i+1]){
                flag=false;
                break;
            }
        }
        if(flag==false){
            System.out.println("Not sorted");
        }
        else{
            System.out.println("Sorted");
        }
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
        CheckSortedOrNot.checkSorted(array,length);
    }
}
