/**
 * 
 */
package SDA;

/**
 * @author bdame
 *
 */
public class Liste {
	private int valeur;
	private Liste suivant;
	
	public Liste(int premier, Liste reste){
		valeur = premier; 
		suivant = reste;
	}
	public int valeurTete() {return(valeur);}
	public Liste queue() {return(suivant);}
	
	public static Liste insererEnTete(int x, Liste L){
		Liste NL = new Liste(x, L);
		return NL;
	}
	public static boolean appartient(int x, Liste L) {
		while(L != null){
			if(L.valeur == x) 
				return true;
			L=L.suivant;
		}
		return false; /* l'�l�ment n'a pas �t� trouv� */
	}
	public static Liste insererEnQueue(int x, Liste L) {
		/* ins�re x en queue de la liste L */
		Liste temp = new Liste(x, null);
		if(L == null)
			return temp;
		//si L n'est pas nulle, on va � la fin de la liste
		Liste p = L;
		while(p.suivant != null)
			p = p.suivant;
		p.suivant = temp;
		return L;
	}
	public static Liste supprimer(int x, Liste L) {
		Liste p = L;
		Liste pred = null; /* pred = pr�d�cesseur de p */
		
		while(p != null && p.valeur != x) {
			pred = p;
			p = p.suivant;
		}
		if(p != null) { /* x a �t� trouv� */
			if (pred == null) /* x = premier �l�ment de la liste */
				return (L.suivant);
			else {
				pred.suivant = p.suivant;
				return L;
			}
		}
		return L;
	}
}
