import java.util.Scanner;
//left rotate the array by using loops and without recurssion
public class LeftRotateByDPositions {

    public static void rotate(int array[],int length,int d){
        if(d>length){ //check whether the d value is greaterthan length or not
            d=d%length;//if the d value is gretaer than the length then by dividing the 'd' with the length we can
            //reduce the d value and reduce no.of rotations by doing this.
            //if d=7 or and length = 6 then 7%6==1
            //rotating of 7 times is equal to the rotating of 1 time
            //because of that we can divide the d with length
        }
        if(d<0){
            d=d+length;
        }        int k=0;
        //creating an empty array to hold the array elements after rotating
        int temp[]=new int[length];
        //rotate the elements
        for(int i=d;i<length;i++){
            temp[k]=array[i];
            k++;

        }
        //rotating the remaining elements
        for(int j=0;j<d;j++){
              temp[k]=array[j];
              k++;
        }
        // copying the temparory elements to the original array
        for(int l=0;l<length;l++){
           array[l]=temp[l];
        }
        System.out.println("Print the elements after rotate");
        //print the array elements after rotating
        for(int l=0;l<length;l++){
            System.out.print(array[l]+" ");
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
        System.out.println("Enter how many times you need to rotate the array");
        int d=scanner.nextInt();
        LeftRotateByDPositions.rotate(array,length,d);
    }
}
