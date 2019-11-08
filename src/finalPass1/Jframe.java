package finalPass1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;


public class Jframe extends JFrame {

	private JPanel contentPane;
	private JTextField resultField;
	private JTextField sizet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel radioButtons = new JPanel();
		
		JRadioButton upperCase = new JRadioButton("uppercase");
		radioButtons.add(upperCase);
		
		JRadioButton lowerCase = new JRadioButton("lowercase");
		radioButtons.add(lowerCase);
		
		JRadioButton number = new JRadioButton("number");
		radioButtons.add(number);
		
		JPanel result = new JPanel();
		
		JPanel max = new JPanel();
		
		JPanel panel = new JPanel();
		
		JButton btnNewButton = new JButton("create");
		btnNewButton.addMouseListener(new MouseAdapter() {	
			
			public void mouseClicked(MouseEvent e) {
				ArrayList<String> passlist = new ArrayList<>();
				if(upperCase.isSelected()) {
					for(int i = 0; i < (SetLetters.UppercaseLetters).length; i++) {
						passlist.add(SetLetters.UppercaseLetters[i]);
						
					}
				}
				if(lowerCase.isSelected()) {
					for(int i = 0; i < (SetLetters.LowercaseLetters).length; i++) {
						
						passlist.add(SetLetters.LowercaseLetters[i]);
						
					}
				}
				if(number.isSelected()) {
					
					for(int i = 0; i < (SetLetters.Numbers).length; i++) {						
						passlist.add(SetLetters.Numbers[i]);						//System.out.print(passlist.get(i));
					}					
				}
				for(int i = 0; i < passlist.size();i++) {
				}
				
				String size = sizet.getText();
				int intSize = Integer.parseInt(size);
				ArrayList<String> password = new ArrayList<>();
			
				
				for (int i = 0; i < intSize; i++) {
					Random rnd = new Random();
					int myRandom = rnd.nextInt(passlist.size());
					password.add(passlist.get(myRandom));								
			}
				String finallypass = password.toString().replace(",", "").replace("[", "").replace("]","");
				resultField.setText(finallypass);
			}});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addComponent(radioButtons, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addComponent(max, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addComponent(result, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(radioButtons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(max, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addComponent(result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		
		JLabel lblPasswordGenerator = new JLabel("Password generator");
		panel.add(lblPasswordGenerator);
		
		JLabel resultl = new JLabel("pass word");
		result.add(resultl);
		
		resultField = new JTextField();
		result.add(resultField);
		resultField.setColumns(10);
		
		JLabel sizel = new JLabel("size");
		max.add(sizel);
		
		sizet = new JTextField();
		
		
		max.add(sizet);
		sizet.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}
}
