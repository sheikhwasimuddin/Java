public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        insertionSort(arr);
        printarr(arr);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // Start from 1, not 0
            int curr = arr[i];
            int prev = i - 1;

            // Shift elements to the right until the correct position is found
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Place current element in the right spot
            arr[prev + 1] = curr;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}