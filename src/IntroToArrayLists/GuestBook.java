package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> guests = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook run = new GuestBook();
		run.UI();
	}
	//oijoiu
	public void UI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button2);
		button.setText("View Names");
		button2.setText("Add Names");
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//JButton buttonPressed = (JButton) e.getSource();
		
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, guests);
		}
		if(e.getSource() == button2) {
			guests.add(JOptionPane.showInputDialog("Enter A Name"));
		}
		
	}
}
