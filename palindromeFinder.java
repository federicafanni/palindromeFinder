package palindromeFinder;

import java.util.Scanner;//Importing the Scanner class so as to take the input from the user.

public class palindromeFinder {

	public static void main(String[] args) { // Calling the returnPalindrome method from the main method
		Palindrome.returnPalindrome();
	}

	static class Palindrome {
		public static void returnPalindrome() {
			Scanner myScanner = new Scanner(System.in);// Creating a scanner object to take the user's input.
			System.out.print("Enter a word or 'q' to quit: ");// This asks for the user's input.
			String word = myScanner.next();// This reads the user's input and assigns it to a string.
			while (!word.equalsIgnoreCase("q")) {/*Ignoring the case of the user's input for string comparison,
													and starting a loop to ask for an input until user types q.*/
				StringBuilder wordStringBuilder = new StringBuilder(word).reverse();/* To reverse the string,
																					 I am using the StringBuilder
																					 object,applying the reverse method.*/

				String reversedWord = wordStringBuilder.toString(); /*Here I am casting to a String the reversed word
																	 in order to allow for comparison of 'word' vs 'reversedWord'
																	 through the if else statement below*/
				if (reversedWord.equalsIgnoreCase(word))// Comparing the words ignoring case differences.
					System.out.print(word + " is a palindrome\n");
					
				else
					System.out.print(word + " is not a palindrome\n");
				
				System.out.print("Enter a word or 'q' to quit: ");
                word = myScanner.next(); 
					
			}
			System.out.println("Goodbye!");
		}
	}
}
