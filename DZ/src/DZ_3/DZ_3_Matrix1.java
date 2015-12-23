package DZ_3;
import java.util.Arrays;
public class DZ_3_Matrix1 {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
   //     int k = 2;
        for (int x = 0; x < matrix.length; x++) {
            matrix [0][x] = x+1;
            for (int y = 1; y < matrix.length; y++) {
                matrix[y][x] = matrix [y-1] [x] * 2;
            }
        }
        for (int y = 0; y < matrix.length; y++) {
            System.out.println(Arrays.toString(matrix[y]));
        }
    }
}

