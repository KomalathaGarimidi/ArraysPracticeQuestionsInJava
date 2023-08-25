import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

////Problem Statement:
//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
// Without altering the relative order of positive and negative elements,
// you must return an array of alternately positive and negative values.
//        Note: Start the array with positive elements.
public class RearrangeArrayElements {
    //it is the brute force approach and it is not optimised
//    public static void rearrange(int array[],int N){
//        ArrayList<Integer>  al1= new ArrayList<>();
//        ArrayList<Integer> al2=new ArrayList<>();
//        for(int i=0;i<N;i++){
//            if(array[i]>0){
//                al1.add(array[i]);
//            }
//            else{
//                al2.add(array[i]);
//            }
//        }
//        for(int i=0;i<N;i++){
//            array[i*2]= al1.get(i);
//            array[i*2+1]= al2.get(i);
//        }
//        }
    public static void rearrange(ArrayList<Integer> al) {
        //Optimised approach
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(al.size(), 0));
//        System.out.println(ans);
        //nCopies() is available in  java.util.Collections
        //used to create an immutable object of n copies
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) > 0) {
                ans.set(posIndex, al.get(i));
                posIndex = posIndex + 2;
            } else {
                ans.set(negIndex, al.get(i));
                negIndex = negIndex + 2;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int N = sc.nextInt();
        int array[] = new int[N];
        System.out.println("Accepting the values into an array");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : array) {
            al.add(i);
        }
        System.out.println(al);
        RearrangeArrayElements.rearrange(al);
    }
}
