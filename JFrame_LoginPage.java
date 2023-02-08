import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame_LoginPage
{
	JFrame f,f2;
	JLabel l1,l2,l3;
	JPasswordField pf;
	JButton b1,b2;
	JTextField tf;


  JFrame_LoginPage()
   {
	   JFrame.setDefaultLookAndFeelDecorated(true);
	   f = new JFrame("Login Page");
	   Container c=f.getContentPane();
	   f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	   Font font=new Font("Times New Roman", Font.BOLD,20);
	   Font font1=new Font("Times New Roman", Font.BOLD,15);
	   l1=new JLabel("Enter Username : ");
	   l2=new JLabel("Enter Password : ");
       tf=new JTextField();
       pf=new JPasswordField(10);
       b1=new JButton("Login");
       b2=new JButton("Reset");
       l1.setFont(font);
       l2.setFont(font);
       b1.setFont(font1);
       b2.setFont(font1);

       b1.addActionListener(new ActionListener()
       {
	   	 public void actionPerformed(ActionEvent ae)
	   	 {
	   	  f.dispose();
	   	  new JFrame_SecondFrame();
	   	 }
	   });

	   /*b2.addActionListener(new ActionListener()
	          {
	   	   	 public void actionPerformed(ActionEvent ae)
	   	   	 {
	   	   	  f.dispose();
	   	   	  new JFrame_SecondFrame();
	   	   	 }
	   });*/

       c.add(l1);
       c.add(tf);
       c.add(l2);
       c.add(pf);
       c.add(b1);
       c.add(b2);
       c.setLayout(null);
       l1.setBounds(50,80,200,40);
       tf.setBounds(250,80,200,40);
       l2.setBounds(50,160,200,40);
       pf.setBounds(250,170,200,40);
       b1.setBounds(125,250,100,40);
       b2.setBounds(250,250,100,40);


       f.setVisible(true);
       f.setSize(500,500);

   }


  public static void main(String [] args)
  {
   JFrame_LoginPage lp =new JFrame_LoginPage();
  }

  public void log()
  {
	  JFrame.setDefaultLookAndFeelDecorated(true);
	  f2=new JFrame("Login Page");
	  Container c=f2.getContentPane();
	  f2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	  l3=new JLabel("You have Login Successfully");
	  c.add(l3);

	  f2.setVisible(true);
	  f2.setSize(500,500);

  }
}













