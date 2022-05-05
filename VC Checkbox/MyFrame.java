import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends Frame
{
	Checkbox c1, c2, c3;
	Button b1;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("My Test Application");
		setLayout(null);
		setBounds(0,0,1260,1000);
		
		c1 = new Checkbox("ICP");
		c2 = new Checkbox("OOP");
		c3 = new Checkbox("IWT");
		b1 = new Button("Submit");
		
		add(c1);
		add(c2);
		add(c3);
		add(b1);
		
		c1.setBounds(100,100,400,100);
		c2.setBounds(100,300,400,100);
		c3.setBounds(100,500,400,100);
		b1.setBounds(100,700,400,100);
		
		f1 = new Font("Times",Font.BOLD,50);
		
		c1.setFont(f1);
		c2.setFont(f1);
		c3.setFont(f1);
		b1.setFont(f1);
		
		c1.addItemListener(ml);
		c2.addItemListener(ml);
		c3.addItemListener(ml);
		b1.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
	}
}