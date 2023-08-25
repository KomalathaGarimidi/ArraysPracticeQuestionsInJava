import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LargestConsecutiveSequence {
    public static void largestConsecutive(int array[],int N){
        Set<Integer> s=new HashSet<>();

        int maxcount=1;
//        add the array elements to set
        for(int k:array){
            s.add(k);
        }
//        System.out.println(s);
        for (int i:s) {
            //lets check the x-1 is present in the set or not.
            //if x-1 is present in the set then x is not the starting point.
            //the consecutive numbers be like this x,x+1,x+2.....
            if(!s.contains(i-1)){
                int count=1;
                int x=i;
                //if x-1 is not present in the set then
                // find the x+1 is present in the list or not
                //if x+2 is present in the list the find x+3 like this just go on...
                while(s.contains(x+1)){
                    x=x+1;
                    count++;
                }
                //find the maxvalue
                maxcount=Math.max(maxcount,count);

            }
        }
        System.out.println(maxcount);

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
        LargestConsecutiveSequence.largestConsecutive(array,N);
    }
}
