package DZ_4; // Мирошниченко Олег
/*ДЗ№4_3: Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
          После замены будет выглядеть {4, 8, 0, 6, -5}.*/
public class Matrix_Min_Max_Change {
    public static void main(String[] args) {
        int[] array = {4, -5, 0, 6, 8};
        int max = array[0];
        int min = array[0];
        int imax = 0;
        int imin = 0;
        System.out.println("Изначальный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i]>max) {
                max = array[i];
                imax = i;
            }
            if (array[i]<min) {
                min = array[i];
                imin = i;
            }
        }
        array[imin] = max;
        array[imax] = min;
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min:" + min);
        System.out.println("Массив Max -> Min: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}




