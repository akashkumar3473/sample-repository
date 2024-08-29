package Assignment_1;

public class mult2DMatrixes {
//    public static void print(int[][] arr){
//        int m = arr.length;
//        int n = arr[0].length;
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        int[][] a = {{1,2,1},{2,1,2},{2,1,1}};
        int[][] b = {{1,2,3},{2,1,7},{2,1,3}};
//        if(a[0].length !=b.length){
//            System.out.println("Multiplication is not possible");
//        }
//        else{
            int[][] c = new int[a.length] [b[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    for(int k=0;k<b.length;k++){
                        c[i][j] =c[i][j] + a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
//            print(a);
//            print(b);
//            print(c);
        //}
    }
}
