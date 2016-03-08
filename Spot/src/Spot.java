/**
 * Classe Spot
 * @author bouchaibkhafif
 * @version 1.3
 * 2014-2015
 * Aucune copie n'est possible sans l'autorisation expresse de l'auteur
 */

import java.util.*;

import timer.Timer;

public class Spot {

	/**
	 * Un spot est constitué d'une marque
	 * String
	 */
	private String marque;

	/**
	 * Un Spot est constitué d'un timer
	 */
	private Timer timer;

	/**
	 * Un spot est constitué d'un ensemble d'ampoules
	 * (tableau d'objets)
	 */
	private  ampoule a[] = new ;
	boolean ty[]= new boolean [tb.taille()];



	/**
	 * Toutes les constantes de classe qui caractérisent
	 * le spot
	 */
	public .................. NB_AMPOULE_DEFAUT = 3;
	public .................. PERIODE_SPOT_DEFAUT = 1;
	public .................. TENSION_NOMINALE = 220;





	/**
	 * Constructeur par défaut
	 * 
	 */
	public Spot(){
		/**
		 * Initialiser la marque
		 */
		//A compléter
		
		

		/**
		 * Initialiser le tableau d'ampoules
		 */
		//A compléter
		
		
		

		/**
		 * Initialiser le timer
		 */
		//A compléter
		
		
		
		


		/**
		 * eteindre le spot
		 */
         //A compléter
         
         
         
         
         
	}


	/**
	 * Constructeur d'initialisation champ à champ
	 * (Aucune copie ne doit être faite)
	 * @param marque
	 * @param tabLampe
	 * @param timer
	 */
	public Spot(String marque, ...... tabAmpoules, ...... timer){
		// A compléter
		
		
		
		
		
		
		
		//Extinction de toutes les ampoules du spot
		this.eteindre();
	}


	/**
	 * Constructeur par copie
	 * @param s
	 */
	public Spot(Spot s){

		// copie de la marque , utilisation du constructeur par copie de String
		// A compléter

		// copie du timer , utilisation du constructeur par copie de Timer
		// A compléter


		// Il faut recopier de la tableau d'ampoules 

		// instanciation du tableau de l'objet courant
		// A compléter

		



		// Copie de chaque Led du Spot s dans le tableau d'Ampoule de this
		// A compléter
		
		
		

		// Extinction de toutes les ampoules du spot
		// A compléter
		
		
		
	}

	// Accesseurs et mutateurs
	


	/**
	 * Initialisation interactive
	 */
	public void init(){
		// A compléter
		
		
		
	}

	/**
	 * Methode toString 
	 */
	// A compléter


	/**
	 * Allume les ampoules du spot
	 * et met a jour l'activite du spot
	 */
	public void allumer(){
	// A compléter
	
	
	
	}


	/**
	 * Eteint les ampoules du spot
	 * et met a jour l'activite du spot
	 */
	public void eteindre(){
     // A compléter	
	
	
	
	}

	/**
	 * Surcharge de allumer(); pourquoi ?
	 * Allume l'ampoule d'indice i
	 * @param i
	 */
	public void allumer(int i){
		// A compléter
		
		
		
	}

	/**
	 * Surcharge de eteindre; pourquoi ?
	 * Eteint l'ampoule d'indice i
	 * @param i
	 */
	public void eteindre(int i){
		// A compléter
		
		
		
	}



	/**
	 * Reset
	 * Permet réinitialiser le spot :
	 * - Les ampoules sont éteintes
	 * - Le timer est remis a sa période par défaut
	 */
	public void reset(){
		// A compléter
		
		
		
	}


	/**
	 * Fait parcourir nB cycle(s) de flash(s) au Spot avec
	 * une temporisation
	 * 
	 * Un cycle est representé par la succession suivante :
	 * [Allume](afficher etat du spot) 
	 * [Eteindre](afficher etat du spot) 
	 * [Allume] (afficher etat du spot) 
	 * <Attente Timer>(afficher etat du spot)  
	 * 
	 * @param nB (int) nombre de cycle
	 */
	public void cycleFlash(int nB){

	// A compléter
		
		
		
		
		
		
	}
}
