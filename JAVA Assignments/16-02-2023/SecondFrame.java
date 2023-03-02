// SecondFrame.java
import javax.swing.*;
public class SecondFrame {
	private JFrame f = new JFrame("Second");

	public SecondFrame() {

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);

		System.out.println("Password is correct");
	}
}