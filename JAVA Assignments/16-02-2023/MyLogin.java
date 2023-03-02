// MyLogin.java
import javax.swing.*;
import java.awt.event.*;
public class MyLogin {
	private JFrame f = new JFrame("Login");
	private JButton bok = new JButton("OK");

	public MyLogin() {

		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.getContentPane().add(bok);

		bok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new SecondFrame();
			}
		});
		f.setSize(100,100);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MyLogin();
	}
}

