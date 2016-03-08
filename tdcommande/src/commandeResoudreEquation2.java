
public class commandeResoudreEquation2 implements Commande{
private Equation2 e;
	public commandeResoudreEquation2(Equation2 e){
		this.e = e;
	}
	public void executer() {
		
		e.init();
		e.calculeDeterminant();
		e.calculeRacines();
		e.afficheSolutions();
	}

	
	

}
