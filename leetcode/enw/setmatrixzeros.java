public class setmatrixzeros {
    public static void main (String[] args){
        class Solution {
            public void setZeroes(int[][] matrix) {
                int m = matrix.length;
                int n = matrix[0].length;
                
                boolean firstRowZero = false;
                boolean firstColZero = false;
                
                // Check if the first row contains zero
                for (int j = 0; j < n; j++) {
                    if (matrix[0][j] == 0) {
                        firstRowZero = true;
                        break;
                    }
                }
                
                // Check if the first column contains zero
                for (int i = 0; i < m; i++) {
                    if (matrix[i][0] == 0) {
                        firstColZero = true;
                        break;
                    }
                }
                
                // Mark zeros on first row and column
                for (int i = 1; i < m; i++) {
                    for (int j = 1; j < n; j++) {
                        if (matrix[i][j] == 0) {
                            matrix[i][0] = 0;
                            matrix[0][j] = 0;
                        }
                    }
                }
                
                // Zero out cells based on marks in first row and column
                for (int i = 1; i < m; i++) {
                    for (int j = 1; j < n; j++) {
                        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                            matrix[i][j] = 0;
                        }
                    }
                }
                
                // Zero out first row if needed
                if (firstRowZero) {
                    for (int j = 0; j < n; j++) {
                        matrix[0][j] = 0;
                    }
                }
                
                // Zero out first column if needed
                if (firstColZero) {
                    for (int i = 0; i < m; i++) {
                        matrix[i][0] = 0;
                    }
                }
            }
        }
        
    }
}
