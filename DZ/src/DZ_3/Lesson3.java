
package DZ_3;
import java.util.Arrays;

// Lesson 3
public class Lesson3 {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = new String("test");
        System.out.println(str1 == str2.intern());
        str1.concat(str2);
        System.out.println(str1);

        char a = 'A';
        int a1 = 65;
        char a3 = '\u0041';
        System.out.println((int) a);
        System.out.println((char) a1);
        System.out.println(a3);

//        for (int i = 0; i < 4; i++) {
//            System.out.println("i = " + i);
//        }
//        int i = 10;
//        while (i > 0) {
//            System.out.println("i = " + i--);
//        }
//        do{
//            System.out.println("ku ku)))");
//        } while(false);
        System.out.println("cycle for------------------");
        int month_days[] = {31,28,32};
        System.out.println(month_days[0]);

        for (int z = 1; z < month_days.length; z++) {
            System.out.println(month_days[z]);
        }
        System.out.println("cycle while------------------");
        int u = 0;
        while(u < month_days.length){
            System.out.println(month_days[u++]);
        }
        System.out.println("cycle for each------------------");
        System.out.println("before cycle" + Arrays.toString(month_days));
        for(int copy : month_days){
            System.out.println(copy);
            copy*=2; // не меняет copy
        }
        System.out.println("After changes" + Arrays.toString(month_days));
        System.out.println("Matrix-------------");
        int matrix [][] = new int[3][3];
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        int k = 0;
        for(int y =0; y<matrix.length; y++){// строки
            k++;
            for(int x =0; x<matrix[y].length; x++){// столбцы
                matrix[y][x] = (x + 1)*k;
                System.out.print(matrix[y][x]); }
        }
       // System.out.println();
    }
}
