
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noeudSujet n = new noeudSujet("racine",5,2);
		NoeudSujetObservateur[] n2 = new NoeudSujetObservateur[2];
		NoeudObservateur[] n3 = new NoeudObservateur[1];
		int i=0;
		for( i = 0;i<2;i++){
			n2[i] = new NoeudSujetObservateur("noeud"+i,5,2);
			n.enregistrerobservateur(n2[i]);
		}
		
		
			n3[0] = new NoeudObservateur("noeudob"+1,5,2);
			n2[0].enregistrerobservateur(n3[0]);
			n2[1].enregistrerobservateur(n3[0]);
			System.out.println(n.toString());
			System.out.println(n2[0].toString());
			System.out.println(n2[1].toString());
			System.out.println(n3[0].toString());
		n.miseAJour(50);
		System.out.println(n.toString());
		System.out.println(n2[0].toString());
		System.out.println(n2[1].toString());
		System.out.println(n3[0].toString());

}
}
