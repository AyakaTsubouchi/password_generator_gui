package finalPass1;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTextField;

public class GetPassword {
	
	public String GetPassword(int size, ArrayList<String> passlist,JTextField resultField) {
		
		ArrayList<String> password = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			Random rnd = new Random();
			int myRandom = rnd.nextInt(passlist.size());
			password.add(passlist.get(myRandom));
		}
		String stringList= password.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
		//resultField.setText(stringList);
		return stringList;
	}
public String GetPassword(int size, ArrayList<String> passlist) {
		
		ArrayList<String> password = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			Random rnd = new Random();
			int myRandom = rnd.nextInt(passlist.size());
			password.add(passlist.get(myRandom));
		}
		String stringList= password.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
		//resultField.setText(stringList);
		return stringList;
	}
}
