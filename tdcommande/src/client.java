
public class client {
private static GestionnaireDeTache g;
private static CommandeAfficherAuRevoir au;
private static CommandeAfficherBonjour b;
private static commandeResoudreEquation2 e;
private static Equation2 e2;
private static afficheur a;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new afficheur();
		e2 = new Equation2();
g = new GestionnaireDeTache();
au = new CommandeAfficherAuRevoir(a);
b = new CommandeAfficherBonjour(a);
e = new commandeResoudreEquation2(e2);

g.enregistrertache(au);

g.enregistrertache(e);
g.enregistrertache(b);
g.executerToutesTaches();
	}

}
