import java.util.Scanner ;

/**
 * @author dominique Bouthinon
 * Resoud une equation du second degre
 *
 */
public class Equation2 
{
	private double a ;
	private double b ;
	private double c ;
	
	private double delta = -1 ; 
	
	private double x1 ;
	private double x2 ;
	private int    nb_racines ;
	

	/**
	 * 
	 */
	public Equation2() 
	{
	}
	
	
	/**
	 *  demande interactivement les coefficients a, b et c de l'Equation
	 */
	public void init()
	{
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("saisie des coefficients a,b, c d'une equation du second degre :") ;
		System.out.println("a ? ") ;
		this.a = s.nextDouble() ;
		
		System.out.println("b ? ") ;
		this.b = s.nextDouble() ;
		
		System.out.println("c ? ") ;
		this.c = s.nextDouble() ;
	}
	
	
	/**
	 * 
	 * calcule le determinant de l'Equation
	 */
	public void calculeDeterminant()
	{
		this.delta = this.b * this.b - 4 * this.a * this.c ;
	}
	

	/**
	 * Calcule les racines de l'Equation
	 */
	public void calculeRacines()
	{
		
		if (delta < 0.0)
		{	
			this.nb_racines = 0 ;
		}	
		else
		{
			this.x1 = -this.b + Math.sqrt(delta) / (2.0 * this.a) ; 
			
			if (delta > 0.0)
			{
				this.nb_racines = 2 ;
				this.x2 = -this.b - Math.sqrt(delta) / (2.0 * this.a) ; 
			}
			else
			{
				this.nb_racines = 2 ;
			}
		}
	}
	
	
	/**
	 *  affiche l'equation et ses racines
	 */
	public void afficheSolutions()
	{
		String s = this.a * this.a + "x^2 + " + this.b  + "x + " + 
	               this.c + "\n" ;
		s = s + "possede " + this.nb_racines + " racine(s) \n" ;
		
		if (this.nb_racines > 0)
		{
			s = s + "x1 = " + this.x1 + "\n" ;
			
			if (this.nb_racines == 2)
			{
				s = s + "x2 = " + this.x2 + "\n" ;
			}
		}
		
	  System.out.println(s) ;
	}
	
	
	

}
