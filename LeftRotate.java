import java.util.Scanner;

public class LeftRotate {
    //shift the elements to left by one position
    public static void rotate(int array[],int length){
        int d=array[0];
        for(int i=1;i<length;i++){
            //assign the element to it previous position
            array[i-1]=array[i];
        }
        //place the first element of the array to the last position of the array
        array[length-1]=d;
        //loop to print the elements after left rotation
        for(int k=0;k<length;k++){
            System.out.print(array[k]+" ");
        }
    }
    public static void main(String[] args) {
        //Scanner to accept the input from the user
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array you want");
        int length=scanner.nextInt();
        int array[]=new int[length];
        System.out.println("Enter the elements for array");
        //accept the numbers as an elements to an array
        for(int i=0;i<length;i++){
            array[i]= scanner.nextInt();
        }
    }
}
