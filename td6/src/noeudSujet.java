import java.util.ArrayList;
public class noeudSujet  extends noeud implements sujet{
	private ArrayList<observateur> p = new ArrayList();
	public noeudSujet(String Nom, int Valeur, int capacite) {
		super(Nom, Valeur, capacite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enregistrerobservateur(observateur o) {
		// TODO Auto-generated method stub
		this.p.add(o);
	}

	@Override
	public void supprimerobservateur(observateur o) {
		// TODO Auto-generated method stub
		this.p.remove(o);
	}

	@Override
	public void notifierobservateur() {
		// TODO Auto-generated method stub
		for(int i = 0;i<this.p.size();i++)
		this.p.get(i).actualiser(this.getValeur());
	}
	public ArrayList<observateur> getP(){
		return this.p;
	}
	public void miseAJour(int val){
		super.setValeur(val);
		this.notifierobservateur();
	}
	public String toString(){
		return super.getNom()+"  "+super.getValeur();
	}

}
