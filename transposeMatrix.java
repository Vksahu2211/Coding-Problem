class transposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int temp; int n=matrix[0].length, m= matrix.length;
         int res[][] = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }

public static void main(String args[]){
    transposeMatrix obj = new transposeMatrix();
    int matrix1[][]={{2,5,6},{5,7,3}};
    int res1[][] = obj.transpose(matrix1);;
    
    System.out.println("Transposed Matrix:");
        for (int i = 0; i < res1.length; i++) {
            for (int j = 0; j < res1[i].length; j++) {
                System.out.print(res1[i][j] + " ");
            }
            System.out.println();
        }
  }
}