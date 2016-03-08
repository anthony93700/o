
public class CommandeAfficherBonjour implements Commande{

	private afficheur a;

	public CommandeAfficherBonjour (afficheur a){
		this.a = a;
	}
	
	

	public void executer() {
		
		a.setMessage("Au revoir");
		a.affiche();
	}

}
