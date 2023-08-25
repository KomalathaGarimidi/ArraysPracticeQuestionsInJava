import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Problem Statement: Given an array, print all the elements which are leaders.
// A Leader is an element that is greater than all of the elements on its right side in the array.
public class LeadersInanArray {
    public static void learders(int array[],int N) {
        int lead=array[N-1];
        ArrayList<Integer> al= new ArrayList<>();
        al.add(lead);
        for(int i=N-2;i>=0;i--){
           if(array[i]>lead){
               lead=array[i];
               al.add(lead);
           }
        }

        Collections.reverse(al);
        System.out.println(al);
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
        LeadersInanArray.learders(array, N);
    }
}
