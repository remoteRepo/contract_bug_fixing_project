package DZ_3;

import java.util.Random;

public class Test_2 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int mass[] = new int [99];
        for (int i =0; i < mass.length; i++){
            mass[i] = random.nextInt();
            if (mass[i]%2 ==0){
                System.out.print(" " + mass[i]);
            }
        }
    }
}
