package DZ_3;

public class Test4 {
    public static void main(String[] args) {
        String name[] = {"name1", "name2", "name3", "name4"};
        int time[] = {123, 567, 564, 56};

        int min = time[0];
        int minIndex = 0;
        for(int i = 1; i<time.length; i++){
            if(min> time[i]){
                min = time[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        System.out.println("name = " + name[minIndex]);
    }
}
