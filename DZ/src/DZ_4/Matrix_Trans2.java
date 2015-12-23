package DZ_4;  // Мирошниченко Олег
/*ДЗ№4_2: получение из матрицы размерностью n на m  транспонированной матрицы
          (cтолбцы со строками меняются местами)*/
import java.util.Arrays;
public class Matrix_Trans2 {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int matrix[][] = new int[m][n];
        int tmatrix[][] = new int[m][n];
        System.out.println("Matrix");
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[3];
            tmatrix[i] = new int[3];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 99);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tmatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Matrix Trans");
        for (int i = 0; i < tmatrix.length; i++) {
             System.out.println(Arrays.toString(tmatrix[i]));
        }

    }
}
