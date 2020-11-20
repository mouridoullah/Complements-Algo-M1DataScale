/**
 * 
 */
package Tris;

/**
 * @author bdame
 *
 */
public class TriParPermutaion {
	
	static void triParPermution(int[] tab, int n) {
		n = tab.length;
		int c, tmp;
		for(c = 2; c <= n; ++c) {
			for (int i = n; i > c; --i) {
				if(tab[i-1] > tab[i]) {
					tmp = tab[i-1];
					tab[i-1] = tab[i];
					tab[i] = tmp;
				}
			}
		}
	}
}
