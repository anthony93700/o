import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
public class  FenSimple extends JFrame {

	public FenSimple (String titre, int x, int y, int w,int h){
		super(titre);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(x,y,w,h);
		this.setVisible(true);
	}
	public static void main(String[] args){
		Toolkit aTK = Toolkit.getDefaultToolkit();
		Dimension dim = aTK.getScreenSize();
		int x = dim.width;
		int y = dim.height;
		new FenSimple ( "ma premiere fenêtre",100,200,500,400);
	}
}
