package DZ_1;

import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int sum;
        System.out.println("Enter First Chislo : ");
        first = scanner.nextInt();
        System.out.println("Enter Second Chislo : ");
        second = scanner.nextInt();
        sum = first + second;
        System.out.println("sum = " + first + " + " + second + " = " + sum);
    }
}
