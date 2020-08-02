package JavaPrograms;

import java.util.Scanner;

public class Swapping2nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int x,y,temp;
		System.out.println("Enter any two numbers");
		x=scan.nextInt();
		y=scan.nextInt();
		scan.close();
		
		/*
		 //with temp third variable
		temp=x;
		x=y;
		y=temp;*/
		
		//Without third variable temp
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swapped numbers are " +x+ " "+y);
			
		
		scan.close();

	}

}
