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
		if(e.getItem().toString()==this.mf.c1.getLabel() || e.getItem().toString()==this.mf.c2.getLabel() ||e.getItem().toString()==this.mf.c3.getLabel())
		{
			if(e.getStateChange()==1)
			{
				al.add(e.getItem().toString());
			}
			else
			{
				al.remove(e.getItem().toString());
			}
		}
		else
		{
			System.out.println(this.mf.cb1.getSelectedCheckbox().getLabel());
		}
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		for(String label:al)
		{
			System.out.println(label);
		}
	}
}