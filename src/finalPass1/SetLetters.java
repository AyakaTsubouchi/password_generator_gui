package finalPass1;

import java.util.ArrayList;

public class SetLetters {
	static String[] UppercaseLetters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P", "Q",
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
	static String[] LowercaseLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
	static String[] Numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
	static ArrayList<String> lettersPool = new ArrayList<String>();
	static int lettersPoolLength = 0;
	

	public static ArrayList<String> uppercase() {

		for (int i = 0; i < UppercaseLetters.length; i++) {
			lettersPool.add(UppercaseLetters[i]);
		}
		lettersPoolLength += UppercaseLetters.length;
		System.out.println(lettersPool);
		return lettersPool;

	}

	public static ArrayList<String> lowercase() {

		for (int i = 0; i < LowercaseLetters.length; i++) {
			lettersPool.add(LowercaseLetters[i]);
		}
		lettersPoolLength += LowercaseLetters.length;
		return lettersPool;
	}
	public static ArrayList<String> numbers() {
		
		for (int i = 0; i < Numbers.length; i++) {
			lettersPool.add(Numbers[i]);
		}
		lettersPoolLength += Numbers.length;
		return lettersPool;
		
	}
}


