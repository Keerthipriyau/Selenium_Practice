package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class TimeDateCalender {

	public static void main(String[] args) {
		/*Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	     fmt.format("%tc", cal);
	      System.out.println(fmt);*/
		
		/* Date date = new Date();
	      String strDateFormat = "hh:mm:ss a";
	      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	      System.out.println(sdf.format(date));*/
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		 Date date = new Date();
	      Calendar cal = Calendar. getInstance();
	     // Formatter fmt = new Formatter();
	      cal.setTime(date);
	     // System.out.println(fmt.format("%tc", cal));
	      System.out.println("today is " + cal.get(Calendar.WEEK_OF_YEAR)+ " week of the year");
	      System.out.println("today is a "+cal.get(Calendar.DAY_OF_MONTH) + " month of the year");
	      System.out.println("today is a "+cal.get(Calendar.WEEK_OF_MONTH) +" week of the month");
	      
	      
	      
	      
	      
	      
	      
	/*      Date date = new Date();
	      String strdate = "hh:mm";
	      SimpleDateFormat sdf = new  SimpleDateFormat("EEEE"); 
	      System.out.println(sdf.format(date));
	      System.out.println(date);*/
	   }
	}