public class mergesort_via_recursion {
    public static int mergesort(int[] arr, int left, int right) {
        if (left >= right) {
            return 0; // Base case: single element
        }

        int mid = left + (right - left) / 2;
        int invCount = 0;

        invCount += mergesort(arr, left, mid);
        invCount += mergesort(arr, mid + 1, right);
        invCount += mergeAndCount(arr, left, mid, right);

        return invCount;
    }
    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < rightArr.length; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        int invCount = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                invCount += (leftArr.length - i); // Count inversions
            }
        }

        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }

        return invCount;
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;
        int invCount = mergesort(arr, 0, n - 1);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumber of inversions: " + invCount);
    }
}
