package JavaPrograms;

import java.util.Scanner;

public class StringAlphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int count;
		String temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of words to be entered");
		count = scan.nextInt();
		String str[] = new String[count];
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter the words one by one");
		for (int i=0; i<count; i++)
			str[i] = scan2.nextLine();
		scan.close();
		scan2.close();
		
		for (int i=0; i<count; i++) {
			for (int j = i+1; j<count; j++) {
				if(str[i].compareTo(str[j])>0)
				{
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
				}
				
			}
							
		}
		
		System.out.print("Sorted words are ");
		for (int i=0; i<count; i++) 
			System.out.println(str[i]);
} catch (Exception e) {
    System.out.println("Something went wrong.");
  }
		
			
	}

}
