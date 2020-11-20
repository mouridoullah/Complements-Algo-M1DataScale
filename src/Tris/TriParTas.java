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
		
		for (int i = 0; i <= n-1; i++) { //construction du tas associé à tabATrier
			unTas.inserer(tab[i]); //O(log n) pour chaque i
		}
		
		for (int i = 0; i <= n-1; i++) {
			//on sélectionne un par un les minimums successifs du tas, qui sont
			//mis à leur place dans le tableau : bonne version du tri par sélection
			
			tab[i] = unTas.minimum(); //O(1) pour chaque i
			
			//suppression du minimum en gardant la structure de tas
			unTas.supprimerMin(); //O(log n) pour chaque i
		}
	}
} //==> Complexité du tri par tas = O(n log n)
