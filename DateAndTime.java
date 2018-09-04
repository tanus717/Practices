package CodingDemo;
import java.util.*;
import java.time.*;

 enum  year{
	JAN,FEB,MARCH,JUNE,JULY;
}
public class DateAndTime {
	
	public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);
		  String month = in.next().toUpperCase();
	//	 String  month = month1;
     	String day = in.next();
		String year1 = in.next();
    	int dd = Integer.parseInt(day);
		int yy = Integer.parseInt(year1);
		
		
		LocalDate dt = LocalDate.of(1992, 05, 03);
		
		
		
		
//		year y = year.valueOf(month);
//		
//		 switch(y) {
//		 default : System.out.println("Default"); break;
//		 case JAN  : System.out.println(dd+"-"+"01"+"-"+yy);  break;
//		 case FEB : System.out.println(dd+"-"+"02"+"-"+yy); break;
//		 }
		

	}
}
