package DZ_2;

// ДЗ № 2.11 Мирошниченко Олег
// Разберитесь, как работает следующий пример:
public class DZ2_11 {
        public static void main(String args[]) {
            int month = 4;
            String season;
            switch (month) {
                case 12:
                case 1:
                case 2:
                    season = "winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "autumn";
                    break;
                default:
                    season = "Not find";
            }
            System.out.println("April- is "+ season + ".");
        }
    }


