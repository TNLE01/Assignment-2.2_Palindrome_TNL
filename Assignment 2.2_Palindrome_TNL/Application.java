
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PalindromeTest test = new PalindromeTest();
		
		System.out.print("Test 1: Enter word to check if it's a palindrome: ");
		String word = scan.nextLine();
		System.out.println(test.isPalindrome(word));
		
		System.out.print("Test 2: Enter word to check if it's a palindrome: ");
		word = scan.nextLine();
		System.out.println(test.isPalindrome(word));
		
		System.out.print("Test 3: Enter word to check if it's a palindrome: ");
		word = scan.nextLine();
		System.out.println(test.isPalindrome(word));
		
	}

}
