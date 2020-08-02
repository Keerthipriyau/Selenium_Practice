package JavaPrograms;

import java.util.Scanner;

public class Anagrams_String {

	 static boolean isAnagram(String a, String b) {
	       int CHARACTER_RANGE= 256;
	           if (a.length() != b.length()) {
	        return false;
	    }
	       a = a.toLowerCase();
	      b = b.toLowerCase();
	    int count[] = new int[CHARACTER_RANGE];
	    for (int i = 0; i < a.length(); i++) {
	        count[a.charAt(i)]++;
	        count[b.charAt(i)]--;
	    }
	    for (int i = 0; i < CHARACTER_RANGE; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
	}
	                
	        
	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter first string: ");
	        String a = scan.next();
	        System.out.println("Enter second string: ");
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
