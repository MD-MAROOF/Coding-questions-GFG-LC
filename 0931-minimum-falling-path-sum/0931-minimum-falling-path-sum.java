class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Iterate from the second row to the last row
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Update the current element with the minimum sum from the above row
                matrix[i][j] += Math.min(matrix[i - 1][j], Math.min(matrix[i - 1][Math.max(0, j - 1)], matrix[i - 1][Math.min(cols - 1, j + 1)]));
            }
        }

        // Find the minimum value in the last row, which represents the minimum falling path sum
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < cols; j++) {
            minSum = Math.min(minSum, matrix[rows - 1][j]);
        }

        return minSum; 
    }
}