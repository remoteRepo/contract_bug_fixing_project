package DZ_0;
// Д/З № 3 Мирошниченко Олег
// Мини-калькулятор
public class MyCalculatorString {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int sum = a+b;
		System.out.println("Resultat: " + sum);
    }
}
