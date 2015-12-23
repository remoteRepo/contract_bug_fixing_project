package DZ_4;

import java.util.Arrays;

public class Matrix_Transponirovanie {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        //flipped
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < (matrix.length); j++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }

    }
}

