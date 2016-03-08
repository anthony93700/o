import java.awt.Toolkit;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import com.farida.android_2048.modele.*;

public class NPanel extends JPanel{
	private Image Image;
	private MoteurJeu M;
public NPanel(String nom){
	Image = Toolkit.getDefaultToolkit().getImage(nom);
	
}
public void paintComponent(Graphics g){
	super.paintComponent(g);
	int hP = this.getHeight();
	int lP = this.getWidth();
	int hR = hP / M.getTaille();
	int lR = lP/ M.getTaille();
	g.drawImage(Image, 0, 0,lP,hP, this);
	g.drawRect(0, 0, lR, hR);
}
}
