public class searchinsortedmatrix {
    // public static void searchitem(int matrix[][], int target) {
    // //1 approach
    //         for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (matrix[i][j] == target) {
    //                 System.out.println("Element found at (" + i + ", " + j + ")");
    //                 return; // stop searching and exit
    //             }
    //         }
    //     }
    //     System.out.println("Element not found");
    // }


    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 33;
        // searchitem(matrix, target);
        stairSearch(matrix, target);
    }

    // 3 approach: stair Search in a sorted matrix (row-wise and column-wise sorted)
    public static void stairSearch(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at (" + row + ", " + col + ")");
                return;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Element not found");
    }

}
