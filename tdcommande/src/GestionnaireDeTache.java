import java.util.ArrayList;


public class GestionnaireDeTache {
	private ArrayList<Commande> t;
	public GestionnaireDeTache(){
		this.t = new ArrayList();
	}
public void enregistrertache(Commande c){
	this.t.add(c);
}
public void retirerTache(Commande c){
	this.t.remove(c);
}
public void executerUneTache(){
	this.t.get(0).executer();
}
public void executerLaTache(Commande c){
	this.t.get(this.t.indexOf(c)).executer();
}
public void executerToutesTaches(){
	for(int i =0;i<t.size();i++){
		this.t.get(i).executer();
	}
}
}
