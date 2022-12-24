package polyankina_kvbo0821.prac4_1.hw_4_1_4;
import java.util.Arrays;

class Matrix {

    private double[][] matrix;
    private int rowsQuantity;
    private int columnsQuantity;

    public Matrix(double[][] matrix, int rowsQuantity, int columnsQuantity) {
        this.matrix = matrix;
        this.rowsQuantity = rowsQuantity;
        this.columnsQuantity = columnsQuantity;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public Matrix(int rowsQuantity,int columnsQuantity) {
        this.rowsQuantity = rowsQuantity;
        this.columnsQuantity = columnsQuantity;
    }

    public double[][] plus_matrix(double[][] A, double[][] B) {

        double C[][] = new double[rowsQuantity][columnsQuantity];

        for (int i = 0; i < rowsQuantity; i++)
            for (int j = 0; j < columnsQuantity; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    public double[][] multiplication_matrix(double[][] A,int digit) {

        double C[][] = new double[rowsQuantity][columnsQuantity];

        for (int i = 0; i < rowsQuantity; i++)
            for (int j = 0; j < columnsQuantity; j++)
                C[i][j] = A[i][j] * digit;
        return C;
    }

    public void print_matrix() {
        System.out.println("The matrix:");
        for (int i = 0; i < columnsQuantity; i++) {
            for (int j = 0; j < rowsQuantity; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

class Tester {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(new double[][] {{1,2,3,4},{1,2,4,5},{1,2,3,4},{1,2,3,4}},4,4 );
        Matrix m2 = new Matrix(new double[][] {{5,7,3,4},{7,8,4,5},{3,2,9,4},{2,7,8,4}},4,4 );
        Matrix m3 = new Matrix(4,4);
        m1.print_matrix();
        System.out.println(Arrays.deepToString(m3.plus_matrix(m1.getMatrix(), m2.getMatrix())));
        System.out.println(Arrays.deepToString(m3.multiplication_matrix(m1.getMatrix(),2)));
    }
}