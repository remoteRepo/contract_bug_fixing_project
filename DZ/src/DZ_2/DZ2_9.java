package DZ_2;

// ДЗ № 2.9 Мирошниченко Олег
/* Даны две переменные целого типа: A и B. Если их значения не равны, то присвоить каждой переменной
сумму этих значений, а если равны, то присвоить переменным нулевые значения.
Вывести новые значения переменных A и B.
      Входные данные: ввести 2 целых  числа  А,В (-1000<= А,В  <=1000).
      Выходные данные:  вывести новые значения переменных A и B.
*/
public class DZ2_9 {
    public static void main(String[] args) {
        int a = -1000;
        int b = 1000;
        if (a == b) {
            a = a + b;
            b = a + b;
            System.out.println("a= " + a + ";" + " b= " + b);
        } else {
            a = 0;
            b = 0;
            System.out.println("a= " + a + ";" + " b= " + b);
        }
    }
}

