import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends Frame
{
	Button b1;
	MenuBar mb1;
	Menu m1;
	MenuItem mi1,mi2;
	MyActionListener ml;
	MyFrame()
	{
		super("My Frame");
		setLayout(null);
		setBounds(0,0,1260,1000);
		ml = new MyActionListener(this);
		
		mi1 = new MenuItem("ADD");
		mi2 = new MenuItem("SUM");
		
		m1 = new Menu("FRAME");
		
		mb1 = new MenuBar();
		
		b1=new Button("SUM");
		
		
		add(b1);
		m1.add(mi1);
		m1.add(mi2);
		
		mb1.add(m1);
		
		setMenuBar(mb1);
		
		b1.setBounds(100,100,50,50);
		
		b1.addActionListener(ml);
		mi1.addActionListener(ml);
		mi2.addActionListener(ml);
		
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