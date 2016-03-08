import java.util.ArrayList;


public class UsineJetAirbus extends UsineJet{
public String Ville;

public UsineJetAirbus(String Ville){
	this.Ville=Ville;
}

@Override
public Jet fabriquerVille(String modele, String marqueReacteur) {
	if(modele.equals("A320")){
		ArrayList<Reacteur> a=new ArrayList<Reacteur>();
		for(int i = 0;i<2;i++){
			if(marqueReacteur.equals("RoolRoyce"))
		 a.add(new Rollroyce(5,10));
			else
				a.add(new Trent(5,10));
		}
		fuselage f = new fuselage(30,120);
		Jet j = new A320("A320","Airbus",a,f);
		return j;
	}else if (modele.equals("A380")){
		ArrayList<Reacteur> a=new ArrayList<Reacteur>();
		for(int i = 0;i<4;i++){
			if(marqueReacteur.equals("RoolRoyce"))
		 a.add(new Rollroyce(9,13));
			else
				a.add(new Trent(9,13));
		}
		fuselage f = new fuselage(110,550);
		Jet j = new A320("A380","Airbus",a,f);
		return j;
	}else
		return null;
	
}

}
