import java.util.Arrays;

class exp3 {
    public static void main(String[] args) {
        int[] oneD = {64, 25, 12, 22, 11};
        Arrays.sort(oneD);
        System.out.println("Sorted 1D array: " + Arrays.toString(oneD));

        int[][] twoD = {
            {9, 4, 7},
            {6, 2, 8},
            {5, 1, 3}
        };

        // Flatten, sort, then copy back to demonstrate sorting a 2D array's values.
        int rows = twoD.length, cols = twoD[0].length;
        int[] flat = new int[rows * cols];
        int index = 0;
        for (int[] row : twoD)
            for (int value : row)
                flat[index++] = value;
        Arrays.sort(flat);

        index = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                twoD[i][j] = flat[index++];

        System.out.println("Sorted 2D array values:");
        for (int[] row : twoD) System.out.println(Arrays.toString(row));
    }
}
