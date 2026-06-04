package Week_1.Day_4;

public class MatrixDiagonalSum {
     public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int pd = 0;
        int sd = 0;
        for(int i=0; i<n; i++) {
            pd += mat[i][i];
            sd += mat[i][n-i-1];
        }
        int sum = pd + sd;
        if(n % 2 != 0) {
            int midx = n/2;
            sum -= mat[midx][midx];
        }
        return sum;
    }
}
