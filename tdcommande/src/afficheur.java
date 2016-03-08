/**
 * 
 */

/**
 * @author dominique 
 * Receveur
 *
 */
public class afficheur 
{
	
	private String message ;

	/**
	 * 
	 */
	public afficheur() 
	{
	}
	
	
	public void setMessage(String unMessage)
	{
		this.message = unMessage ;
	}
	
	
	public void affiche()
	{
		System.out.println(this.message) ;
	}

}
// fin classe Afficheur
