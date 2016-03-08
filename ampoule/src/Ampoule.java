import java.util.*;

public class Ampoule {

    private int couleur;
    private int puissance;
    private boolean estAllumee;
    
    /**
     * Contructeur par défaut
     */
    public Ampoule() {
    	
    	/**
    	 * Appel du constructeur d'initialisation champ à champ
    	 * il faut que ce soit la première instruction
    	 */
        this(0,0,false);
    }
    
 public Ampoule(ampoule a) {
    	
    	this.couleur = a.couleur;
    	this.puissance = a.puissance;
    	this.estAllumee = a.estAllulee;
        
    }
    /**
     * Constructeur d'initialisation champ à champ
     * @param couleur (int) : couleur à affecter à this.couleur
     * @param puissance (int) : puissance à affacter à this.puissance
     * @param estAllumee (boolean) : activité à affecter à this.estAllumee
     */
    public Ampoule(int couleur, int puissance, boolean estAllumee) {
        this.couleur = couleur;
        this.puissance = puissance;
        this.estAllumee = estAllumee;
    }
    
    /**
     * Constructeur par recopie
     * @param a (Ampoule) Référence de l'instance sur
     * <BR/> Ampoule à recopier dans this
     */
    public Ampoule(Ampoule a){
    	this.couleur = a.couleur;
    	this.puissance = a.puissance;
    	this.estAllumee = a.estAllumee;
    }
        
    /**
     * Accesseurs et mutateurs
     */
    
    /**
     * Accesseur pour la couleur
     * @return
     */
    public int getCouleur() {
        return couleur;
    }

    /**
     * Mutateur pour la couleur
     * @param couleur
     */
    public void setCouleur(int couleur) {
    	/**
    	 * On change l'état de l'objet que si la températeur
    	 * de la couleur est conforme
    	 * 
    	 * On verra que le mécanisme des exceptions est
    	 * beaucoup plus efficace
    	 */
    	  if (this.estCouleurValide(couleur))
        	this.couleur = couleur; 	   
    }

    /**
     * Acesseur pour la puissance
     * @return
     */
    public int getPuissance() {
        return puissance;
    }
    
    /**
     * Accesseur pour l'activité de l'ampoule
     * @return
     */
    public boolean getEstAllumee() {
		return estAllumee;
	}

    /**
     * Mutateur pour l'activité de l'ampoule
     * @param estAllumee
     */
	public void setEstAllumee(boolean estAllumee) {
		this.estAllumee = estAllumee;
	}

	
	/**
	 * Mutateur pour la puissance de l'ampoule
	 * @param puissance
	 */
	
	public void setPuissance(int puissance) {
		/**
    	 * On change l'état de l'objet que si la températeur
    	 * de la puissance est conforme
    	 * 
    	 * On verra que le mécanisme des exceptions est
    	 * beaucoup plus efficace
    	 */
	 	if (this.estPuissanceValide(puissance))
          this.puissance = puissance;
    }
	
	/**
	 * Allume l'ampoule
	 */
    public void allumer() {
       this.estAllumee = true;
    }
    
    /**
     * Eteint l'ampoule
     */
    public void eteindre() {
       this.estAllumee = false;        
    }

    /**
     * Méthode d'initialisation intéractive
     */
    public void init(){
    	Scanner input = new Scanner(System.in);
    	
    	do {
    		System.out.println("Couleur de l'ampoule");
    		this.couleur = input.nextInt();
    	} while (!this.estCouleurValide(this.couleur));
    	
    	do {
    		System.out.println("Puissance de l'ampoule");
    		this.puissance = input.nextInt();
    	} while (!this.estPuissanceValide(puissance));
    	
    	
    	// L'ampoule est forcement eteinte
    	this.estAllumee = false;
    	
    	input.close();
    }
   	
	/**
	 * Méthode toString()
	 */
    public String toString() {
        String s =  "Ampoule [couleur=" + couleur + ", puissance=" + puissance;
        if (this.estAllumee){
    		s+=", allumee";
    	} else {
    		s+=", eteinte";
    	}
    	s+="]";
    	return s;
    }
        
    // Méthodes utilitaires appartenant à la vue privée
    
    /**
     * Vérifie si la couleur est valide ou pas
     * @param couleur (int) : couleur à vérifier
     * @return (boolean) : true si la couleur est valide, false sinon
     */
    private boolean estCouleurValide(int couleur){
    	return couleur >=2000 && couleur <=7000;
    }
        
    /**
     * Vérifie si la puissance est valide ou pas
     * @param puissance (int) : puissance à vérifier
     * @return (boolean) : true si la puissance est valide, false sinon
     */
    private boolean estPuissanceValide(int puissance){
    	return puissance >=1 && puissance <=8;
    }
}