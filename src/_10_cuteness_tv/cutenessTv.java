package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class cutenessTv implements ActionListener {
	public static void main(String[] args) {
		cutenessTv ct= new cutenessTv();
		ct.showGui();
	}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton a = new JButton();
JButton b = new JButton();
JButton c = new JButton();
void showGui() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(a);
	panel.add(b);
	panel.add(c);
	a.addActionListener(this);
	b.addActionListener(this);
	c.addActionListener(this);
	frame.pack();
}
void showDucks() {
     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
     
     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
     //work on some Linux implementations
     try {
     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
     if (Runtime.getRuntime().exec(new String[] {
      "which", "xdg- open" }).getInputStream().read() != -1) {
     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
     }
     } else {
          URI uri = new URI(videoID);
          java.awt.Desktop.getDesktop().browse(uri);
     }      } catch (Exception e) {
          e.printStackTrace();
     }
}
@Override
public void actionPerformed(ActionEvent arg0) {
	//detect which button is pressed
	
}
}
