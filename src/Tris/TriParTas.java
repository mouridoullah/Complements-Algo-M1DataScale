/**
 * 
 */
package Tris;

import SDA.TasMin;

/**
 * @author bdame
 *
 */
public class TriParTas {
	static void triParTas(int[] tab) {
		
		int n = tab.length;
		TasMin unTas = new TasMin(n);
		
		for (int i = 0; i <= n-1; i++) { //construction du tas associ� � tabATrier
			unTas.inserer(tab[i]); //O(log n) pour chaque i
		}
		
		for (int i = 0; i <= n-1; i++) {
			//on s�lectionne un par un les minimums successifs du tas, qui sont
			//mis � leur place dans le tableau : bonne version du tri par s�lection
			
			tab[i] = unTas.minimum(); //O(1) pour chaque i
			
			//suppression du minimum en gardant la structure de tas
			unTas.supprimerMin(); //O(log n) pour chaque i
		}
	}
} //==> Complexit� du tri par tas = O(n log n)
