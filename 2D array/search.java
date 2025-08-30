import java.util.Scanner;

public class search {
    public static boolean SearchKey(int arr[][],int key){
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String[] args) {
          //initialisation
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

        System.out.println();
        int key = 5; // Example key to search for
        SearchKey(arr, key);
    }
}
