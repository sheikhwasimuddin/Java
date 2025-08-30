import java.util.*;
public class Smallest {
    public static void main(String[] args) {
        int arr[][]= new int[3][3];
        int n=arr.length;
        int m=arr[0].length;

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("the array is:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

        // Find the smallest element
        int smallest = arr[0][0];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                smallest = Math.min(smallest, arr[i][j]);
                //Or else use
                // if (arr[i][j] < smallest) {
                //     smallest = arr[i][j];
                // }
            }
        }
        System.out.println("The smallest element is: " + smallest);
    }
}
