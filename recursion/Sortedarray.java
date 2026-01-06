public class Sortedarray {

    public static boolean isSorted(int arr[], int i) {
        // Base case: reached last index
        if (i == arr.length - 1) {
            return true;
        }

        // If current > next, not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call forward
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {5};   // works for 1 element also
        boolean r = isSorted(arr, 0);
        System.out.println(r);
    }
}
