import java.util.Random;


public class matrice {

private double[][]matrice;
private int taille;

public matrice(int taille){
	this.matrice=new double[taille][taille];
	this.taille=taille;
}
public void crerMatrice(){
	Random r =new Random();
	for(int i=0;i<this.taille;i++)
		for(int y=0;y<this.taille;y++)
				this.matrice[i][y]=r.nextDouble();
}
public double[][] getMatrice(){
	return this.matrice;
}
public int gettaille(){
	return this.taille;
}
}
