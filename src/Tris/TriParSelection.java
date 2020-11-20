/**
 * 
 */
package Tris;

/**
 * @author bdame
 *
 */
public class TriParSelection {
	
	static void triSelection(int[] tab) {
		
		int n=tab.length, i, j, p, temp;
		
		for(i=0 ; i<=n-2 ; i++) {
			/* les éléments de 0 à i-1 sont déjà triés
			i : place où on doit mettre le suivant plus petit
			p : place du plus petit des non triés */
			p=i;
			for(j=i+1 ; j<=n-1 ; j++) {
				if(tab[j] < tab[p])
				p=j;
			}
			/* on échange tab[i] et tab[p] */
			temp=tab[i]; tab[i]=tab[p]; tab[p]=temp;
		}
	}
}
