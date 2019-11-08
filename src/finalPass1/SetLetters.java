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

	public static ArrayList<String> setletter(ArrayList<String> setlist, String[] array) {

		for (int i = 0; i < array.length; i++) {
			setlist.add(array[i]);
		}
		return setlist;
	}
}
