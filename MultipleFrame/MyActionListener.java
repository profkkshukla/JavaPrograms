import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFrame1 mf1;
	
	MyActionListener(MyFrame m){
		this.mf = m;
	}
	MyActionListener(MyFrame1 m){
		this.mf1 = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("SUM"))
		{
			System.out.println(e.getActionCommand() + "=" + this.mf.b1);
			//JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
			//JOptionPane.showConfirmDialog(null, "choose one", "choose one", JOptionPane.YES_NO_OPTION);
			//Object[] possibleValues = { "First", "Second", "Third" };
			//Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
			//System.out.println(selectedValue.toString());
			mf1 = new MyFrame1();
			this.mf1.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("ADD"))
		{
			System.out.println(e.getActionCommand()  + "=" + this.mf1.b2);
			mf = new MyFrame();
			this.mf.setVisible(true);
			this.mf1.setVisible(false);
			
		}
		
	}
}