/**
 * 
 */
package Tris;

/**
 * @author bdame
 *
 */
public class TriFusion {
	
	static void triFusion(int[] tab, int g, int d) throws Exception {
		if(g > d) throw new Exception("Error");
		if(g < d) {
			int q = (d+g)/2;
			triFusion(tab, g, q);
			triFusion(tab, q+1, d);
			fusion(tab, g, q, d);
		}
	}
	
	private static void fusion(int[] tab, int g, int q, int d) {
		int[] t = new int[d-g+1]; 
		int i,j,k;
		
		i = g; k = g; j = q + 1;
		
		while(i <= q && j <= d) {
			if(tab[i] < tab[j]) {
				t[k] = tab[i];
				i = i + 1;
			}else {
				t[k] = tab[j];
				j = j + 1;
			}
			k = k + 1;
		}
		
		while(i < q) {
			t[k] = tab[i];
			i = i + 1;
			k = k + 1;
		}
		
		while(j < d) {
			t[k] = tab[j];
			j = j + 1;
			k = k + 1;
		}
		tab = t;
	}
}
