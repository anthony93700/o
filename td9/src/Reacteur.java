
public class Reacteur {
private String marque;
private int poids;
private int pouse;

public Reacteur(String marque,int poids,int pouse){
	this.marque=marque;
	this.poids=poids;
	this.pouse=pouse;
}
public String toString(){
	return ""+this.marque+this.poids+this.pouse;
}

}
