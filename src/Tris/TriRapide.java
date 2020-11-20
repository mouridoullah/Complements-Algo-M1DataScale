/**
 * 
 */
package Tris;

/**
 * @author bdame
 *
 */
public class TriRapide {
	static void triRapide(int[] tab, int p, int r) throws Exception {
		int q;
		if(p > r) throw new Exception("Error");
		if(p < r) {
			q = partition(tab, p, r);
			triRapide(tab, p, q);
			triRapide(tab, q+1, r);
		}
	}

	private static int partition(int[] tab, int p, int r) {
		int pivot, i, j, tmp;
		i = p; j = r; pivot = tab[p];

		while(i < j) {
			
			while(tab[i] < pivot) i = i + 1;
			while(tab[j] > pivot) j = j - 1;
			
			if(i < j) {
				tmp = tab[j];
				tab[j] = tab[i];
				tab[i] = tmp;
				
				i = i + 1;
				j = j - 1;
			}
		}
		return j;
	}
}
