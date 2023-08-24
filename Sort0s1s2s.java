import java.util.Scanner;
//Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort
// the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
public class Sort0s1s2s {
    public static void sort0s1s2s(int array[]){
        int i=0;
        int j=0;
        int k=array.length-1;
        while (j<=k){
            if(array[j]==0){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                j++;
                i++;
            }
           else if(array[j]==1){
                j++;
            }
            else{
                int temp=array[j];
                array[j]=array[k];
                array[k]=temp;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int N= sc.nextInt();
        int array[] =new int[N];
        System.out.println("Accepting the values into an array");
        for(int i=0;i<N;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Print the values before sorting");
        for(int i=0;i<N;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Print the elements after sorting");
        Sort0s1s2s.sort0s1s2s(array);
        for(int i=0;i<N;i++){
            System.out.print(array[i]+" ");
        }
    }
}
