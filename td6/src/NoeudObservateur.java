
public class NoeudObservateur  extends noeud implements observateur{

	public NoeudObservateur(String Nom, int Valeur, int capacite) {
		super(Nom, Valeur, capacite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actualiser(int val) {
		// TODO Auto-generated method stub
		this.mettreajour(val);
	}
	public String toString(){
		return super.getNom()+"  "+super.getValeur();
	}

}
