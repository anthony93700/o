import java.util.ArrayList;
public abstract class  Jet {
private String marque;
private String modele;
private ArrayList<Reacteur> r;
private fuselage f;



public Jet(String modele,String marque,ArrayList<Reacteur>r,fuselage f){
	this.marque = marque;
	this.modele = modele;
	this.r=r;
	this.f=f;
}

public String toString(){
	String p="";
	for(int i = 0;i<r.size();i++)
	p = this.r.get(i).toString();
	
	return p+this.f+this.modele+this.marque;
}
}
