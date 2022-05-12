import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame1 extends Frame
{
	Button b2;
	MyActionListener ml;
	MyFrame1()
	{
		
		super("My Frame - 1");
		setLayout(null);
		setBounds(0,0,1260,1000);
		ml = new MyActionListener(this);
		
		
		b2=new Button("ADD");
		
		
		add(b2);
		
		
		b2.setBounds(100,100,50,50);
		
		b2.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	
}