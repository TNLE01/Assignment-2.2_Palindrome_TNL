
/**
 * @author Truong Le
 */
import java.util.Stack;

public class PalindromeTest {
	
	public Stack<Character> original = new Stack<Character>();
	public Stack<Character> reverse = new Stack<Character>();
	
	/**
	 * Remove all spaces and punctuations and from the String as well as making it all lowercase to make it easier to compare
	 * @param word The word to remove all the extra stuff from
	 * @return String without spaces and punctuations and in all lowercase
	 */
	public String removeExtra(String word) {
		return word.replaceAll("[^a-zA-Z]", "").toLowerCase();
	}
	
	/**
	 * Move the chars of the string into a stack
	 * @param word String with chars to move
	 * @param stack The stack the chars move into
	 */
	public void stringToStack(String word, Stack<Character> stack) {
		char[] letters = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			stack.push(letters[i]);
		}
	}
	
	/**
	 * Reverse the String
	 * @param word String to be reversed
	 * @return The reverse String
	 */
	public String reverseString(String word) {
		String reversedWord = "";
		char x;
		for (int i = 0; i < word.length(); i++) {
			x = word.charAt(i);
			reversedWord = x + reversedWord;
		}
		return reversedWord;
	}
	
	/**
	 * Compare the two stacks to see if they equal
	 * @param stack1 Stack to compare
	 * @param stack2 Stack to compare
	 * @return True if they all equal, false otherwise
	 */
	public boolean compareStack(Stack<Character> stack1, Stack<Character> stack2) {
		int size = original.size();
		for (int i = 0; i < size; i++) {
			if (stack1.pop() == stack2.pop()) {}
			else
				return false;
		}
		return true;
	}
	
	/**
	 * Check to see if the String is a Palindrome or not
	 * @param word String to check if is a Palindrome
	 * @return True if the word is a Palindrome, false otherwise
	 */
	public boolean isPalindrome(String word) {
		original.clear(); reverse.clear();
		String cleanWord = removeExtra(word);
		stringToStack(cleanWord, original);
		stringToStack(reverseString(cleanWord), reverse);
		return compareStack(original, reverse);
	}
	
}
