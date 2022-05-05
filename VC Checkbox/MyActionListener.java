import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;

public class MyActionListener implements ItemListener, ActionListener
{
	MyFrame mf;
	ArrayList <String> al;
	
	MyActionListener(MyFrame m){
		this.mf = m;
		al = new ArrayList<String>();
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getStateChange()==e.SELECTED)
		{
			al.add(e.getItem().toString());
			//System.out.println(e.getItem().toString() +" is Selected");
		}
		else
		{
			al.remove(e.getItem().toString());
			//System.out.println(e.getItem().toString() +" is Deselected");
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		for(String s:al)
		{
			System.out.println(s);
		}
	}
	
}