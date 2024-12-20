import java.util.*;

class gfg2012{
    public ArrayList<Integer> spiralTraverse(int mat[][]){
        ArrayList<Integer> result = new ArrayList<>();
        if(mat==null || mat.length ==0 || mat[0].length == 0){
            return result;
        }

        int n = mat.length;
        int m = mat[0].length;

        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        while(top<=bottom && left<=right){
            for(int i=left; i<= right; i++){
                result.add(mat[top][i]);
            }
            top++;

            for(int i=top; i<= bottom; i++){
                result.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left along the bottom row.
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                // Traverse from bottom to top along the left column.
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}