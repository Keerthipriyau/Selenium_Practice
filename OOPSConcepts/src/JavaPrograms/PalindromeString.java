package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		String str, strrev="";
	    System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		scan.close();
		
		//System.out.println("Reversed String");
		j=str.length();
		
		for(i=j-1; i>=0; i--)
			
		{
		strrev=strrev+str.charAt(i);
	}
		System.out.println("Reversed String " +strrev);
		if(strrev.equalsIgnoreCase(str))
			System.out.println("Entered String is a Palindrome");
		else
			System.out.println("Entered String is not a Palindrome");
		
}
}
