package DZ_0;
import java.util.Calendar;

public class HelloWorld{
    public static void main(String[] args) {
		Calendar myCalendar = Calendar.getInstance();
		int currentHours = myCalendar.getTime().getHours();
		System.out.println("currentHours= " + currentHours);
		if (args.length>0){
			System.out.println("Hello " + args[0]);
		}
		 else {
			System.out.println("Vvedi imya ");
			}
}
}