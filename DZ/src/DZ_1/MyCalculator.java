package DZ_1;
// Д/З № 3 Мирошниченко Олег
// Мини-калькулятор
import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("Mini - Calculator:");
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite pervoe chislo: ");
        int chislo1 = scanner.nextInt();
        System.out.println("Vvedite pervoe chislo: ");
        int chislo2 = scanner.nextInt();
        System.out.println("Vvedite znak operatsii: ");
        String operatsya = scanner.next();
        scanner.close();
        switch(operatsya)
        {
            case "*": result = chislo1 * chislo2;
                break;
            case "/": result = chislo1 / chislo2;
                break;
            case "+": result = chislo1 + chislo2;
                break;
            case "-": result = chislo1 - chislo2;
                break;
        }
        System.out.println("Resultat: " + result);
    }
}
