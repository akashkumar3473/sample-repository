package Assignment_1;

public class add2DMatrixes {
    public static void main(String[] args) {
        int[][] a = {{8,10,9},{4,5,6},{7,8,9}};
        int[][] b = {{3,2,1},{6,5,4},{9,8,7}};
        int m = a.length;
        int n = b.length;
        int[][] c = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                        c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
