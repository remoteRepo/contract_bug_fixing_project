package DZ_2;

// ДЗ № 2.10 Мирошниченко Олег
/*Использовать только условный оператор! (без циклов)
Даны три числа. Найти наименьшее из них.
Входные данные: ввести 3 целых  числа  А,В,C (-1000<= А,В  <=1000).
Выходные данные:  вывести наименьшее из них.*/
public class DZ2_10 {
    public static void main(String[] args) {
        int a = -10;
        int b = 20;
        int c = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        if (a < b && a < c) {
            System.out.println("а - Это наимненьшее число");
        } else {
            if (b < a && b < c) {
                System.out.println("b - Это наимненьшее число");
            } else {
                if (c < a && c < b) {
                    System.out.println("c - Это наимненьшее число");
                }
            }
        }
    }
}
