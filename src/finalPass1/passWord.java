package finalPass1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*1) Create a program that generates the alphabet from a to z
2) Extend that program to create a 'word' that contains random characters
3) Extend that program to create a 'word' that is between min length and max length in size
4) Extend that program to include Numbers from 0 - 1 as well
5) Extend that program to only include letters/numbers from which we specify
6) Create a program that tells if a word is a palindrome or not
7) Create a program that 'reverses' the word*/

//I'm sorry but I didn't read the assignment well, so this code isn't separated each question.
//and it's so messy and not user friendly... but this is my first work in this course.finally I made it.
//I hope I can fix it until end of this course.  

public class passWord {
	public static void main(String[] args) {

		String[] UppercaseLetters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] LowercaseLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] Numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
		ArrayList<String> lettersPool = new ArrayList<String>();

		// ask users wich kind of data do u wanna use
		int useUppercase;
		int useLowercase;
		int useNumbers;
		int lettersPoolLength = 0;
		int minLength;
		int maxLength;

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Do you use Uppercase letters? \n yes:1 no:0");
		useUppercase = myObj.nextInt(); // Read user input

		System.out.println("Do you use Lowercase letters? \n yes:1 no:0");
		useLowercase = myObj.nextInt(); // Read user input

		System.out.println("Do you use numbers? \n yes:1 no:0");
		useNumbers = myObj.nextInt(); // Read user input

		System.out.println("minimum length: \n 1~10");
		minLength = myObj.nextInt(); // Read user input

		System.out.println("max length: \n minimum ~ 10");
		maxLength = myObj.nextInt(); // Read user input

		switch (useUppercase) {
		case 0:

			break;
		case 1:
			for (int i = 0; i < UppercaseLetters.length; i++) {
				lettersPool.add(UppercaseLetters[i]);
			}
			lettersPoolLength += UppercaseLetters.length;
		}

		switch (useLowercase) {
		case 0:

			break;
		case 1:
			for (int i = 0; i < (LowercaseLetters.length); i++) {
				lettersPool.add(LowercaseLetters[i]);
			}
			lettersPoolLength += LowercaseLetters.length;

			switch (useNumbers) {
			case 0:

				break;
			case 1:

				for (int i = 0; i < Numbers.length; i++) {
					lettersPool.add(Numbers[i]);
				}
				lettersPoolLength += Numbers.length;
			}
			
			for (int i = 0; i < lettersPoolLength; i++) {
			}
			// 2) Extend that program to create a 'word' that contains random characters
			// get a letter from lettersPool rondomly
			int rndLength = getRandom(maxLength, minLength);
			Random rnd = new Random();
			for (int i = 0; i < rndLength; i++) {
				int myRandom = rnd.nextInt(lettersPoolLength);
				System.out.print(lettersPool.get(myRandom));
			}
			System.out.println("");
			// 7) Create a program that 'reverses' the word*/
			String x = "dog";
			System.out.println("original: "+x);
			reverse(x);
			
			System.out.println("check if a word is a palindrome or not");
			System.out.println(isPalindrome(x));
		}
	}

	public static int getRandom(int max, int min) {
		Random rnd = new Random();
		int getRandom = rnd.nextInt(max - min) + min;
		return getRandom;
	}

	// 7) Create a program that 'reverses' the word*/
	public static void reverse(String text) {
		String clean = text.replaceAll("\\s+", "").toLowerCase();
		for (int i = clean.length() - 1; i >= 0; i--) {
			char result = clean.charAt(i);
			System.out.print(result);
		}
		System.out.println("");
	}

	// 6) Create a program that tells if a word is a palindrome or not
	public static boolean isPalindrome(String text) {
		String clean = text.replaceAll("\\s+", "").toLowerCase();
		int length = clean.length();
		int forward = 0;
		int backward = length - 1;
		
		while (backward > forward) {
			char forwardChar = clean.charAt(forward++);
			char backwardChar = clean.charAt(backward--);
			if (forwardChar != backwardChar)
				return false;
		}
		return true;
	}

}
