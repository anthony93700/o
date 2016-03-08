import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FenFrame extends JFrame{
	public FenFrame(String title, int w, int h){
		super(title);
		this.initialise();
		this.setSize(w,h);
		this.show();
		
	}
	public void initialise()
	{
		Container c = this.getContentPane();
		JPanel pEntree=this.creePanelCentre();
		c.add(pEntree, "Center");
		
	
	}
	public JPanel creePanelCentre()
	{
		JPanel pCentre=new JPanel (new GridLayout(2,2,80,20));
		
		return pCentre;
	}
}
