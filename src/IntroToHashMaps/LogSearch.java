package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("ID");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");
	
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		LogSearch search = new LogSearch();
		
		search.UI();
	}
	
	public void UI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		button1.addActionListener(this);
		panel.add(button2);
		button2.addActionListener(this);
		panel.add(button3);
		button3.addActionListener(this);
		panel.add(button4);
		button4.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (pressed == button1) {
			String number = JOptionPane.showInputDialog("Enter an ID");
			int num = Integer.parseInt(number);
			String name = JOptionPane.showInputDialog("Enter a name");
			hash.put(num, name);
		}
		if (pressed == button2) {
			String search = JOptionPane.showInputDialog("Enter an ID");
			int realsearch = Integer.parseInt(search);
			if (hash.containsKey(realsearch) == true) {
				JOptionPane.showMessageDialog(null, hash.get(realsearch));
			}
			else if (hash.containsKey(realsearch)==false) {
				JOptionPane.showMessageDialog(null, "This ID does not exist");
			}
		}
		if (pressed == button3) {
			String message = null;
			for (int i : hash.keySet()) {
				message = "ID: " + i + " Name: " + hash.get(i) + " ";
				
			}
			JOptionPane.showMessageDialog(null, message);
			
		}
		if(pressed == button4) {
			String remove = JOptionPane.showInputDialog("Enter an ID");
			int removenum = Integer.parseInt(remove);
			if (hash.containsKey(removenum) == true) {
				hash.remove(removenum);
			}
			else if (hash.containsKey(removenum) == false) {
				JOptionPane.showInputDialog("This ID does not exist");
			}
		}
	}
}
