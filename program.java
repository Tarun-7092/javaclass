
public class program {
    public static void main(String[] args) {
        int n = 5; // Size of the matrix
        int[][] spiral = new int[n][n];

        int value = 1; // Number to fill
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            // Left to Right (Top Row)
            for (int i = left; i <= right; i++) {
                spiral[top][i] = value++;
            }
            top++; // Move down

            // Top to Bottom (Right Column)
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = value++;
            }
            right--; // Move left

            // Right to Left (Bottom Row)
            for (int i = right; i >= left; i--) {
                spiral[bottom][i] = value++;
            }
            bottom--; // Move up

            // Bottom to Top (Left Column)
            for (int i = bottom; i >= top; i--) {
                spiral[i][left] = value++;
            }
            left++; // Move right
        }

        // Print the Spiral Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", spiral[i][j]); // Formatting for alignment
            }
            System.out.println();
        }
    }
}
