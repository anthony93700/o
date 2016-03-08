
import medias.*;

import java.util.ArrayList;

public class TestCollectionMedias {


	/**
	 * Méthode de classe
	 * <BR/> Permet d'afficher les objets qui se trouvent dans
	 * <BR/> la collection a
	 * @param a (ArrayList)
	 */
	public static void afficheMedias(ArrayList a){
		int indice =0;

		/**
		 * Expliquez cette boucle.
		 * Liaision statique ?
		 * Liaison dynamique ?
		 * Qu'est ce qui est polymorphe ?
		 */
		for (Object o : a){
			System.out.println("indice :" + indice + "-->" + o);
			indice++;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * instancier un media m1
		 * titre : "Support de cours de Java"
		 */
		Media m1 = new Media("support de cour");



		/**
		 * instancier un CdAudio m2
		 * titre : "Mozart"
		 * duree : 120 minutes
		 */
		CdAudio m2 = new CdAudio("Mozart",120);




		/**
		 * instancier un Livre m3
		 * titre : "Histoire de France"
		 * duree : 480 pages
		 */
		Media m3 = new Livre("Histoire de France",480);


		/**
		 * Afficher les medias
		 */




		/**
		 * Instancier une collection (ArrayList)
		 */
		ArrayList mediatheque = new ArrayList();


		/**
		 * Afficher la taille de la médiathèque.
		 * Expliquez le résultat
		 *
		 */
		System.out.println(mediatheque.size()+"");


		/**
		 * Inserer m1 puis m2 à la fin de la médiathèque
		 */
		mediatheque.add(m2);
		mediatheque.add(m1);



		/**
		 * Afficher le contenu de la médiathèque.
		 * Expliquez le résultat
		 */

		afficheMedias(mediatheque);

		/**
		 * Afficher la taille de la médiathèque.
		 * Expliquez le résultat
		 */


		System.out.println(mediatheque.size());

		/**
		 * Inserer m3 à la position d'indice 1 dans la médiathèque
		 */

		mediatheque.add(1,m3);


		/**
		 * Afficher le contenu de la médiathèque.
		 * Expliquez le résultat
		 */

		afficheMedias(mediatheque);

		/**
		 * Afficher la taille de la médiathèque.
		 * Expliquez le résultat
		 */


		System.out.println(mediatheque.size());


		/**
		 * Instancier un Livre l1
		 * titre : "Puccini"
		 * duree : 480 pages
		 */
		Livre l1 = new Livre ("Puccini",480);



		/**
		 * Inserer l1 à la position d'indice 10 dans la médiathèque
		 * Expliquez le résultat
		 */

try{
		mediatheque.add(10,l1);}
		catch(IndexOutOfBoundsException e){
			mediatheque.add(mediatheque.size(),l1);
		}

		/**
		 * Corrigez la situation précédente en capturant l'exception spécifique
		 * et en corrigeant l'erreur en insérant le livre en fin de médiatheque



		
		/**
		 * On souhaite récupérer tous les medias dans un tableau tab (tableau de taille
		 * fixe)
		 * Proposez une solution
		 */
	Media tab[]= new Media[mediatheque.size()];
	for(int i = 0;i<mediatheque.size();i++){
		tab[i] = (Media) mediatheque.get(i);
	}




		/**
		 * Affichez les medias du tableau
		 */

	for(int i = 0;i<mediatheque.size();i++){
		System.out.println(tab[i]);
	}




		/**
		 * Afficher la taille de la médiathèque.
		 * Expliquez le résultat
		 */
	System.out.println(mediatheque.size());



		/**
		 * Supprimer de la médiatheque le média qui se trouve
		 * à l'indice 1 de la médiatheque
		 */
		mediatheque.remove(1);


		/**
		 * Afficher la taille de la médiathèque.
		 * Expliquez le résultat
		 */
		System.out.println(mediatheque.size());



		/**
		 * Afficher le contenu de la médiathèque.
		 * Expliquez le résultat
		 */
		afficheMedias(mediatheque);



	}
	

}