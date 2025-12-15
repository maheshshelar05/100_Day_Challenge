
import java.util.Scanner;

public class PalindromeString {

	public PalindromeString() {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str=s.next();
		s.close();
		
		  String reversedStr = new StringBuilder(str).reverse().toString();
//		StringBuilder str2=sb.reverse();
		 
		if (str.equals(reversedStr))
			System.out.println("Palindrome String ");
		else
			System.out.println("NOT Palindrome String  ");
		
	}
	public static void main(String[] args) {
		PalindromeString p=new PalindromeString();
		
	}
}
