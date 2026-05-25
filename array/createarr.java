import java.util.Scanner;
public class createarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //user input array
        int []arr1=new int[5];
        for(int i=0;i<arr1.length;i++){
            System.out.println("enter element at index "+i);
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
