package JavaPrograms;

import java.time.LocalDate;
import java.util.Scanner;

public class FindingDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		//String month = in.next();
		 System.out.println("Enter the Month in the format of number: ");
		int mm = in.nextInt();
		//String day = in.next();
		 System.out.println("Enter the Day in the format of number: ");
		int dd = in.nextInt();
		//String year = in.next();
		 System.out.println("Enter the Year in the format of number: ");
		int yy = in.nextInt();
		in.close();
		LocalDate dt = LocalDate.of(yy, mm, dd);
		 System.out.println("The Day of the provided date is:  ");
		System.out.print(dt.getDayOfWeek());
	
	}

}
