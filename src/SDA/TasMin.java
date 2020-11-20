/**
 * 
 */
package SDA;

/**
 * @author bdame
 *
 */
public class TasMin {
	private int[] tab;
	private int nbVal = 0; //nb de valeurs, donc indice de la 1ère case libre
	
	public TasMin(int t) {
		tab = new int[t];
	}
	public boolean estVide() {return(nbVal == 0);}
	public boolean estPlein() {return(nbVal == tab.length);}
	
	public int minimum() {
		/* retourne la plus petite valeur (celle de
		la racine) */
		return(tab[0]);
	}
	
	public void inserer(int val) {
		
		int fils = nbVal, pere = (fils-1)/2;
		tab[fils] = val;
		while(pere >= 0 && val < tab[pere]) {
			tab[fils] = tab[pere];//père descend
			tab[pere] = val;//val remonte
			fils = pere;
			pere = (fils-1)/2;
		}
		nbVal++;
	}
	
	public void supprimerMin() {
		nbVal--; //on diminue de 1 le nombre d'éléments
		int fils, pere = 0, val = tab[nbVal]; //val = « dernière clé »
		tab[0] = val; //cette valeur est stockée à la racine
		do {
			fils = -1; //au début, pas de fils identifié de valeur < val
			if((2*pere + 1) < nbVal) //si fils gauche existe
				fils = 2*pere + 1; //le meilleur fils courant est le gauche
			if(fils != -1 && (2*pere+2) < nbVal && tab[2*pere + 2] < tab[fils])
			//si fils droit existe et a 1 valeur + petite que le gauche
				fils++; //le fils ayant la valeur min est le droit
			if(fils != -1 && val > tab[fils]) { //si val > min des 2 fils
				tab[pere] = tab[fils]; //le min des 2 fils remonte
				tab[fils] = val; //val descend
				pere = fils; //le sommet contenant val est maintenant fils
			}else {
				fils = -1; //aucun fils, ou aucun de valeur < val
			}
		} while(fils != -1); //stop si feuille ou bien val <= aux 2 fils
	}
	
}
