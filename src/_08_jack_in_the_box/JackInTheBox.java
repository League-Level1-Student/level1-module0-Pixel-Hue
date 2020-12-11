package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox {
	int a = 0;
	
	public static void main(String[] args) {
		
		 JackInTheBox jb = new JackInTheBox();
		jb.showPicture("jackInTheBox.png");
		 
	}
	public void showPicture(String fileName) {
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          JFrame frame2 = new JFrame();
	 		 JButton button = new JButton();
	 		 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		 button.setText("Suprise!");
	 		 frame2.add(button);
	 		 button.setText("Suprise!");
	         
	          frame2.setVisible(true);
	         
	         
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	          frame.add(imageLabel);
	         
	         //add mouse listener
	          frame.setVisible(false);
	          frame.pack();
	          if (a == 4) {
	   		   frame.setVisible(true);
	 		 }
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	 public void actionPerformed(ActionEvent arg0, String fileName) {
		
		 a++;
		
	 }
	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
}
