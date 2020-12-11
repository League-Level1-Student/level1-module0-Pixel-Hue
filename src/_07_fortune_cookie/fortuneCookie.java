package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
	Random ran = new Random();
	JFrame frame = new JFrame();
	 JButton button = new JButton();
	  public void showButton() {
          System.out.println("Button clicked");
          frame.setVisible(true);
          frame.add(button);
          frame.pack();
          button.addActionListener(this);
     }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		 int ran = new Random().nextInt(5);
		 if (ran == 0) {
			 JOptionPane.showMessageDialog(null, "A fresh start will put you on your way.");
		 }
		 else if (ran == 1) {
			 JOptionPane.showMessageDialog(null, "A friend asks only for your time not your money.");
		 }
		 else if (ran == 2) {
			 JOptionPane.showMessageDialog(null, "A golden egg of opportunity falls into your lap this month.");
		 }
		 else if (ran == 3) {
			 JOptionPane.showMessageDialog(null, "A lifetime friend shall soon be made.");
		 }
		 else if (ran == 4) {
			 JOptionPane.showMessageDialog(null, "A new perspective will come with the new year.");
		 }
		 
	}
}
