import java.util.Scanner;
//Two Sum : Check if a pair with given sum exists in Array
public class TwoSum {
    public static String sum(int array[],int N,int target){
        int sum;
        boolean flag=false;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                sum=0;
                if(array[i]<target && array[j]<target){

                    sum=array[i]+array[j];
                }
                if(sum==target){
                    flag=true;
                    break;
                }

            }
            if(flag==true){
                return "Yes";
            }
        }
            return "No";
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
        System.out.println("Enter the taarget value");
        int target=sc.nextInt();
        System.out.println(TwoSum.sum(array, N, target));
    }
}
