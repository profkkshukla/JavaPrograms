import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DisplayWindowWidth extends JFrame
{
	JButton display;
	DisplayWindowWidth()
	{
		super("My Test Application");
		setLayout(null);
		setBounds(0,0,1260,1000);
		display =  new JButton("Test");
		add(display);
	

		this.addComponentListener(new ComponentListener() 
		{
		// this method invokes each time you resize the frame
			public void componentResized(ComponentEvent e) 
			{   
				System.out.println(getSize().getWidth());
				System.out.println(getSize().getHeight());
				display.setBounds(((int)getSize().getWidth())/4,
									((int)getSize().getHeight())/4,
									((int)getSize().getWidth())/2,
									((int)getSize().getHeight())/2);
				System.out.println("Changed");         
			}
			public void componentHidden(ComponentEvent e) 
			{            
				         
			}
			public void componentShown(ComponentEvent e) 
			{            
				         
			}
			public void componentMoved(ComponentEvent e) 
			{            
				        
			}
		});
	}
	public static void main(String srgs[])
	{
		DisplayWindowWidth dw = new DisplayWindowWidth();
		dw.setVisible(true);
	}
}
