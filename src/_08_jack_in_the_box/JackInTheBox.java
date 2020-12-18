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

public class JackInTheBox implements ActionListener {
	int a = 0;
	
	public static void main(String[] args) {
		
		 JackInTheBox jb = new JackInTheBox();
		jb.showButton();
		 
	}
	
	public void showButton() {
		JButton button = new JButton();
		 button.setText("Suprise!");
		 JFrame frame2 = new JFrame();
		 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame2.add(button);
		 frame2.setVisible(true);
		 button.addActionListener(this);
	}
	 
	
	public void showPicture(String fileName) {
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	         frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	        
	          
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		 a++;
		 if (a > 4) {
	   		   showPicture("jackInTheBox.png");
	 		 }
	}
}
