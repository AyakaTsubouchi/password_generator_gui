package finalPass1;



import java.util.ArrayList;
import java.util.Random;


public class getpass extends Jframe{
	static ArrayList<String> password = new ArrayList<String>();
	
	public getpass(int size) {
		
		for (int i = 0; i < size; i++) {
			Random rnd = new Random(password.size());
			int myRandom = rnd.nextInt();			
				
		}
		
	}
}
