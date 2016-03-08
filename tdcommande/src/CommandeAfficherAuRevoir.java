
public class CommandeAfficherAuRevoir implements Commande{
private afficheur a;

	public CommandeAfficherAuRevoir (afficheur a){
		this.a = a;
	}
	
	
	@Override
	public void executer() {
		// TODO Auto-generated method stub
		a.setMessage("Bonjour");
		a.affiche();
	}


	

}
