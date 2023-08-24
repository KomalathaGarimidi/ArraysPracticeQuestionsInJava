import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Find the Majority Element that occurs more than N/2 times
//Problem Statement: Given an array of N integers, write a program to return an element that
// occurs more than N/2 times in the given array. You may consider that such an element
// always exists in the array.
public class MajorityElement {
    public static void majorElement(int array[],int length){
        Map<Integer,Integer> hp=new HashMap<>();
        for (int i:array) {
            if(hp.containsKey(i)){
                hp.put(i,hp.get(i)+1);
            }
            else{
                hp.put(i,1);
            }
        }
        System.out.println(hp);
        int maxcount=0;
        for (Map.Entry<Integer,Integer> entry: hp.entrySet()) {
            if(entry.getValue()>maxcount){
                maxcount= entry.getKey();
            }
        }
        if(maxcount>(length/2)){
            System.out.println(maxcount);
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
        MajorityElement.majorElement(array,length);
    }
}
