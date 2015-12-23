package DZ_3;

//ДЗ-3_2_v.2 Треугольник Паскаля
//Мирошниченко Олег

public class PascalTriangle_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int one = 1;
            System.out.print(one);
            for (int j = 1; j <= i; j++) {
                one *= (i - j + 1);
                one /= j;
                System.out.print("-");
                System.out.print(one);
            }
            System.out.println();
        }
    }
}
