public class quicksort {
    public static void quickSort(int[] arr, int si, int ei) {
        if (si < ei) {
            int pi = partition(arr, si, ei);

            quickSort(arr, si, pi - 1);
            quickSort(arr, pi + 1, ei);
        }
    }
    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = (si - 1);

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
