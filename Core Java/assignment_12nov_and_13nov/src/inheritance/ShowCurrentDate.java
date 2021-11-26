package inheritance;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowCurrentDate {
	
	
		public static void main(String[] args) {
		//this gives the current system date 
			GregorianCalendar obj = new GregorianCalendar();
			int todaysDate = obj.get(Calendar.DATE);
			int todaysMonth = obj.get(Calendar.MONTH)   +  1;
			int todaysYear = obj.get(Calendar.YEAR);

			System.out.println(todaysDate+"-"+todaysMonth+"-"+todaysYear);
			
		}
		
		
	

}
