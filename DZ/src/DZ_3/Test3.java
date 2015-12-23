package DZ_3;

import java.util.Arrays;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int mas1[] = {1,2,3};
        int mas2[] = {4,5,6};
        double mas3[] ={mas1[0]/mas2[0], mas1[1]/mas2[1], mas1[2]/mas2[2]};
        System.out.println(mas1[0]+ " " +mas1[1]+ " " + mas1[2] );
        System.out.println(mas2[0]+ " " +mas2[1]+ " " + mas2[2] );
        System.out.println(mas3[0] + " " + mas3[1] + " " + mas3[2]);

        Random random = new Random(9);
        int mass1[] = new int[10];
        int mass2[] = new int[10];
        double mass3[] = new double[10];
        int counter = 0;
        for(int i = 0; i < mass1.length; i++){
            mass1[i] = random.nextInt();
            mass2[i] = random.nextInt();
            mass3[i] = mass1[i]/mass2[i];
            if (mass3[i]%1 ==0){
                counter++;
                //System.out.println(counter);
            }
            //System.out.println(counter);
        }
        System.out.println(Arrays.toString((mass1)));
        System.out.println(Arrays.toString((mass2)));
        System.out.println(Arrays.toString((mass3)));
    }
}
