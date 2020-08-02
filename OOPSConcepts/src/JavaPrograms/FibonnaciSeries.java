package JavaPrograms;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, a=0, b=0, c=1;
		System.out.println("Enter the number of times");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		scan.close();
		System.out.println("Fibonacci Series is");
		
		for(i=0; i<=n; i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}
		}

	}

