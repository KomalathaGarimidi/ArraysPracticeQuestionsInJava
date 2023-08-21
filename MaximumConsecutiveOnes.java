import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void ConsecutiveOnes(int array[],int length){
        int maxcount=0;
        int count=0;
        for (int i=0;i<length;i++) {
            if (array[i]==1) {
                count++;
            }
            else if(maxcount<count) {
                maxcount=count;
                count=0;
            }
        }

        if (maxcount>count) {
            System.out.println(maxcount);
        } else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int length=scanner.nextInt();
        int array[]=new int[length];
        System.out.println("Enter the elements for array");
        for(int i=0;i<length;i++){
            array[i]= scanner.nextInt();
        }
        MaximumConsecutiveOnes.ConsecutiveOnes(array,length);
    }
}
