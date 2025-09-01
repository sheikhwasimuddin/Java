public class searchinsortedmatrix {
    public static void searchitem(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at (" + i + ", " + j + ")");
                    return; // stop searching and exit
                } else if (matrix[i][j] > target) {
                    break;
                }
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 50;
        searchitem(matrix, target);
    }
}
