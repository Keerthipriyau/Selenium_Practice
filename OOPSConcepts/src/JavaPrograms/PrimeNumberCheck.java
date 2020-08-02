package JavaPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num, i, temp;
		boolean isPrime = true;
		System.out.println("Enter any number");
		num=scan.nextInt();
		
		scan.close();
		for(i=2; i<=num/2; i++) {
			temp = num%i;
			if(temp == 0)
				isPrime=false;
		}
		if(isPrime)
			System.out.println(num+ " Entered number is a prime number");
		else
			System.out.println(num+ " Entered number is NOT a prime number");
				
	
	
	}
		
	}


