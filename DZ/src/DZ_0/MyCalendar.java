package DZ_0;
import java.util.Calendar;
public class MyCalendar {

    public static void main(String args[]) {
        Calendar calendarObject = Calendar.getInstance();
        int hour = calendarObject.getTime().getHours();
        System.out.println("The current time is: " + hour);
        if (hour > 6 && hour < 11) {
            System.out.println("Good morning");

        } else {
            System.out.println("Good day");
        }
        }
    }

