package DZ_3;

import java.util.Arrays;

public class PascalTriangleMatrix {
    public static void main(String[] args) {
        int matrix[][] = new int[5][];
        matrix[0] = new int[1];
        matrix[1] = new int[2];
        matrix[0][0] = matrix[1][0] = matrix[1][1] = 1;

        for (int i = 2; i < matrix.length; i++) {// бегаем по строкам
            matrix[i] = new int[i + 1]; //динамическое заполнение памяти
            for (int j = 0; j < matrix[i].length; j++) {//бегаем по столбцам
                if (j == 0 || j == matrix[i].length - 1) {// если у меня первый столбик или последний присваиваем 1
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];// matrix[i - 1][j - 1] = 1; предыдущая
                                                                           // строка и первый элемент столбца этой строчки
                                                                           // matrix[i - 1][j] = 1ж предыдущая строка текущий элемент
                }
            }
        }
// выводим результат
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
