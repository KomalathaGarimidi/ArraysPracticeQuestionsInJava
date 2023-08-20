import java.util.Scanner;
import java.util.Set;

public class SecondLargestElement {
    public static void secondlarge(int array[],int length){
        int Fmax=Integer.MIN_VALUE;//Fmax and Smax are set to be very smallest values in java
        int Smax=Integer.MIN_VALUE;//It will give the second max value whenever the array contains only negative numbers also
        for(int i=0;i<length;i++){
            if(array[i]>Fmax){ //check whether the given element is greater than Fmax or not
                Smax=Fmax;
                Fmax=array[i];
            }
            else if(array[i]>Smax && array[i]<Fmax){ //checking that is there any element i.e greater than Smax and lessthan Fmax
                Smax=array[i];
            }
        }
        System.out.println(Smax);
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
        SecondLargestElement.secondlarge(array,length);
    }
}
