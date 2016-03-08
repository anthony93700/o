
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matrice m1 = new matrice(5);
		m1.crerMatrice();
		matrice m2 = new matrice(5);
		m2.crerMatrice();
		matrice m3 = new matrice(5);
	for(int i=0;i<5;i++){
		sommeThread t = new sommeThread(i,i);
		t.run();
	}
	}

}
