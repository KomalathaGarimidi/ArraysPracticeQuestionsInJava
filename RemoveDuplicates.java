import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDuplicatesFromSortedArray(int array[],int length){
        //The code which is in comments is also used to remove the duplicates from a sorted array
        // but this code is not optimised because it takes xtra space
//        int temp[]=new int[array.length];
//        int k=0;
//        int i=0;
//        temp[k]=array[i];
//        for(i=1;i<length ;i++){
//            if(array[i]!=temp[k]){
//                k++;
//                temp[k]=array[i];
//
//            }
//        }
//        for (int j=0;j<=k;j++){
//            System.out.print(temp[j]+" ");
//        }
        //This is the code not in comments is optimised and it does not take any xtra space to remove the elements
        // with in this code we remove the elements with in hte array itself
        int j=0;
        int i=1;
        for(i=1;i< array.length;i++){
            if(array[j]!=array[i]){
                j++;
                array[j]=array[i];
            }
        }
        for(int k=0;k<=j;k++){
            System.out.print(array[k]+" ");
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
        RemoveDuplicates.removeDuplicatesFromSortedArray(array,length);
    }
}
