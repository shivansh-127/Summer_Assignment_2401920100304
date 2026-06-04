package Week_1.Day_4;

import java.util.ArrayList;
import java.util.List;

public class ReshapeTheMatrix {
     public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c) {
            return mat;
        }
       List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                list.add(mat[i][j]);
            }
        }
        int[][] ans = new int[r][c];
        int k=0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                ans[i][j] = list.get(k++);
            }
        }
        return ans;
        
    }
}
