import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends Frame
{
	MenuBar mb1;
	Menu m1,m2,mi4;
	MenuItem mi1,mi2,mi3,mi5,mi6;
	CheckboxMenuItem mi7;
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup cb1;
	Font f;
	Button b1;
	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("My Test Application");
		setLayout(null);
		setBounds(0,0,1260,1000);
		
		mb1 = new MenuBar();
		m1 = new Menu("Find");
		m2 = new Menu("Delete");
		mi1 = new MenuItem("Answer-1");
		mi2 = new MenuItem("Answer-2");
		mi3 = new MenuItem("Answer-3");
		mi4 = new Menu("Answer-4");
		mi5 = new MenuItem("Answer-41");
		mi6 = new MenuItem("Answer-42");
		mi7 = new CheckboxMenuItem("Answer-43");
		
		
		c1 = new Checkbox("RRR");
		c2 = new Checkbox("BAHUBALI-2");
		c3 = new Checkbox("KGF-2");
		
		cb1 = new CheckboxGroup();
		c4 = new Checkbox("C",cb1,false);
		c5 = new Checkbox("C++",cb1,false);
		c6 = new Checkbox("JAVA",cb1,true);
		
		b1 = new Button("DISPLAY");
		f = new Font("Times",Font.BOLD,30);
		
		m1.add(mi1);
		m1.add("-");
		m1.add(mi2);
		
		m2.add(mi3);
		
		mi4.add(mi5);
		mi4.add(mi6);
		mi4.add(mi7);
		m2.add(mi4);
		
		
		mb1.add(m1);
		mb1.add(m2);
		
		setMenuBar(mb1);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(b1);
		
		c1.setBounds(100,100,300,100);
		c2.setBounds(100,300,300,100);
		c3.setBounds(100,500,300,100);
		c4.setBounds(500,100,300,100);
		c5.setBounds(500,300,300,100);
		c6.setBounds(500,500,300,100);
		b1.setBounds(100,700,300,100);
		
		c1.setFont(f);
		c2.setFont(f);
		c3.setFont(f);
		c4.setFont(f);
		c5.setFont(f);
		c6.setFont(f);
		b1.setFont(f);
		mi1.setFont(f);
		mi2.setFont(f);
		mi3.setFont(f);
		mi4.setFont(f);
		mi5.setFont(f);
		mi6.setFont(f);
		mi7.setFont(f);
		
		c1.addItemListener(ml);
		c2.addItemListener(ml);
		c3.addItemListener(ml);
		c4.addItemListener(ml);
		c5.addItemListener(ml);
		c6.addItemListener(ml);
		b1.addActionListener(ml);
		mi1.addActionListener(ml);
		mi2.addActionListener(ml);
		mi3.addActionListener(ml);
		//mi4.addActionListener(ml);
		
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