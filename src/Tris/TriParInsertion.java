/**
 * 
 */
package Tris;

/**
 * @author bdame
 *
 */
public class TriParInsertion {
	
	static void triInsertionSequentielle(int[] tab) {
		
		for(int j = 1 ; j <= tab.length-1 ; j++) {
			int cle = tab[j];
			
			int i = j-1;
			
			while ((i >= 0) && (tab[i] > cle)) {
				//décalage vers la droite
				tab[i+1] = tab[i];
				i = i-1;
			}
			//clé mise définitivement à sa place
			tab[i+1]=cle;
		}
	}
}
