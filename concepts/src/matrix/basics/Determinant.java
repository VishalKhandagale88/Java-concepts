package matrix.basics;

public class Determinant {
    public static void main(String[] args) {
        int [][] matrix = {{1,2},{2,5}};
        int i = det2x2(matrix);
        System.out.println(i);


    }
    public static void matrixDet(int[][] matrix,int row , int col) throws Exception {
        if (row!=col){
            throw  new Exception("Not a Square matrix");
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                
            }
        }
    }


    public static int det2x2(int[][] matrix){
        if (matrix.length!=2){
            return 0;
        }
        int firstElementInFirstRow = matrix[0][0];
        int secondElementInFirstRow = matrix[0][1];
        int firstElementInSecondRow = matrix[1][0];
        int secondElementInSecondRow = matrix[1][1];
        return firstElementInFirstRow *secondElementInSecondRow - secondElementInFirstRow*firstElementInSecondRow;
    }
}
