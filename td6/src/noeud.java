
public class noeud {
	private String nom;
	private int valeur;
	private int capacite;
public noeud(String Nom,int Valeur,int capacite){
	this.capacite = capacite;
	this.nom = Nom;
	this.valeur = Valeur;
}
public void setNom(String Nom){
	this.nom = Nom;
}
public void setValeur(int val){
	this.valeur = val;
}
public void setCapacite(int cap){
	this.capacite = cap;
}
public String getNom(){
	return this.nom;
}
public int getValeur(){
	return this.valeur;
}
public int getCapacite(){
	return this.capacite;
}
public String toString(){
	return this.nom+this.valeur+this.capacite+"";
}
public void mettreajour(int n){
	this.setValeur(n * this.getCapacite()+this.getValeur());
}
}
