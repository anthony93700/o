
public class sommeThread extends Thread{
	
	private int debut;
	private int fin;
	

	public sommeThread(int debut,int fin){
		this.debut=debut;
		this.fin=fin;
		
	}
	
	public void run() {
		for(int i = debut;i<fin;i++)
			for(int y =0;y<fin;y++)
	    m3[i][y]=m1.getMatrice[i][y]+m2.getMatrice[i][y];
	  }
	public double[][] getmatrice(){
		return this.resultat;
	}

}
