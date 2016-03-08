import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.JFrame;
import com.farida.;

public class Test_2048 {
/**
 * @param args
 */
public static void main()
{
	
	MoteurJeu j =  MoteurJeu.getInstance();
	j.setup();
	int z;
	Scanner s = new Scanner(System.in);
	while(j.partieTerminee())
	{
		z = s.nextInt();
		if(z==0)
		j.deplacer(MoteurJeu.BAS);
		else if (z==1)
			j.deplacer(MoteurJeu.HAUT);
		else if(z==2)
			j.deplacer(MoteurJeu.GAUCHE);
		else if(z==3)
			j.deplacer(MoteurJeu.DROITE);
		j.getGrilleTuiles();
		
		
	}
	
}
}