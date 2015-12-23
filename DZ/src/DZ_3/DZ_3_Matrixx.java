package DZ_3;
//D_Z3 Мирошниченко Олег
// матрица - заполнить динамически
//        1 2 3
//        2 4 6
//        4 8 12
import java.util.Arrays;
public class DZ_3_Matrixx {
    public static void main(String[] args) {
        System.out.println("Matrix-------------");
        int matrix[][] = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        // int k = 0;
        for (int y = 0; y < matrix.length; y++) {// строки
            matrix[0][y] = y + 1;
            for (int x = 1; x < matrix.length; x++) {// столбцы
                matrix[x][y] = matrix[x - 1][y] * 2;
            //    System.out.print(matrix[y][x]);
            }
        }
        // System.out.println();
        System.out.println("Matrix_NEW-------------");
        for (int x = 0; x < matrix.length; x++) {
            System.out.println(Arrays.toString(matrix[x]));

        }
    }
}

