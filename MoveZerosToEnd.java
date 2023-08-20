import java.util.Scanner;

public class MoveZerosToEnd {
    public static void zerosToEnd(int array[],int length){
        int z=0;
        int nz=0;
        while(nz<length) {
            if(array[nz]!=0){
                int temp=array[z];
                array[z]=array[nz];
                array[nz]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }

            }

        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=scanner.nextInt();
        int array[]=new int[length];
        System.out.println("Enter the elements for array");
        for(int i=0;i<length;i++){
            array[i]= scanner.nextInt();
        }

        MoveZerosToEnd.zerosToEnd(array,length);
    }
}
