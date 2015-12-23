package DZ_4; // Мирошниченко Олег
/*ДЗ№4_1: Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 0 до 99.
           Выполните по отдельности сначала сложение, потом умножения матриц друг на друга. Выведете исходные
           матрицы и результат вычислений на консоль.*/
import java.util.Arrays;
public class Matrix1plus2 {
    public static void main(String[] args) {
        int c[][] = new int[3][3];
        System.out.println("Matrix C Input Random------------");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = (int) (1 + (Math.random() * (100 - 1)));
            } System.out.println(Arrays.toString(c[i]));}
        int d[][] = new int[3][3];
        System.out.println("Matrix D Input Random-----------");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                d[i][j] = (int) (1 + (Math.random() * (100 - 1)));
            } System.out.println(Arrays.toString(d[i]));}
        int summa[][] = new int[3][3];
        for (int i = 0; i < summa.length; i++) {
            for (int j = 0; j < summa.length; j++)
                summa[i][j] = c[i][j] + d[i][j];}
        System.out.println("Matrix SUMMA C + D---------------");
        for (int i = 0; i < summa.length; i++) {
            for (int j = 0; j < summa.length; j++) { }System.out.println(Arrays.toString(summa[i]));}
        int proiz[][] = new int[3][3];
        for (int i = 0; i < proiz.length; i++) {
            for (int j = 0; j < proiz.length; j++)
                proiz[i][j] = c[i][j] * d[i][j];}
        System.out.println("Matrix PROIZ C * D---------------");
        for (int i = 0; i < proiz.length; i++) {
            for (int j = 0; j < proiz.length; j++) {}System.out.println(Arrays.toString(proiz[i]));}}}