
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;


import com.farida.android_2048.modele.*;

public class Test_2048 {
/**
 * @param args
 */
public static void main(String [] args)
{
	Toolkit aTK = Toolkit.getDefaultToolkit();
	Dimension dim = aTK.getScreenSize();
	MoteurJeu j =  MoteurJeu.getInstance();
	
	
	j.setup();
	new FenJeu ( "ma premiere fenêtre",500,700);
	Scanner input  = new Scanner(System.in);
	int deplacement;
	while(!j.partieTerminee())
	{
		System.out.println(j.getGrilleTuiles().toString());
		System.out.println("votre score: "+ j.getScore());
		System.out.println("Nombre de deplacement " + j.getNombreDeplacements());
		do{
			System.out.println("Entrez un déplacement \n Haut = 0 \n Bas = 2\n Droite = 1 \n gauche = 3");
			deplacement = input.nextInt();		
		}while(deplacement !=0 && deplacement !=1 && deplacement !=3 && deplacement !=3);
		j.deplacer(deplacement);
	}
	
		
		
		
		
	}
	
	
}

