package JavaPrograms;

import java.util.Scanner;

public class ReverseofaNumber {

	public static void main(String[] args) {
		
		
	int a, res=0, n, temp = 0;
	System.out.println("Enter any number");
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	scan.close();
	temp = n;
	System.out.println("Reversed number is ");
	while (n!=0)
	{
	a=n%10;
	res=(res*10)+a;
	n=n/10;
	
	}
	System.out.print("" +res);
	if (res==temp)
		System.out.println(" Palindrome number");
	else
		System.out.println(" Not a Palindrome number");
		
}
}
