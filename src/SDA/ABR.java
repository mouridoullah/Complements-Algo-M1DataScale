/**
 * 
 */
package SDA;

/**
 * @author bdame
 *
 */
class Arbre{
	int key;
	int data;
	Arbre filsG;
	Arbre filsD;
	Arbre pere;
}
public class ABR {
	Arbre root;
	public ABR(Arbre root) {
		this.root = root;
	}
	
	static Arbre abrMax(Arbre r) {
		while(r.filsD != null) {
			r = r.filsD;
		}
		return r;
	}
	
	static Arbre abrMin(Arbre r) {
		while(r.filsG != null) {
			r = r.filsG;
		}
		return r;
	}
	
	static boolean rechercheNoeud(Arbre x, int key) {
		if (x != null) {
			if (x.key == key) {
				return true;
			}else if(x.key > key) {
				return (rechercheNoeud(x.filsD, key));
			}else {
				return (rechercheNoeud(x.filsG, key));
			}
		}else {
			return false;
		}
	}
	
	static Arbre abrSuccesseur(Arbre x) {
		Arbre y;
		if (x.filsD != null) {
			return (abrMin(x).filsD);
		}
		y = x.pere;
		while(y != null && x == y.filsD) {
			x = y;
			y = y.pere;
		}
		return y;
	}
	
	static Arbre abrInsertionRec(Arbre r, Arbre z) {
		if(r == null) {
			return z;
		}else { 
			if(z.key < r.key) {
				r.filsG = abrInsertionRec(r.filsG, z);
				return r;
			}else {
				r.filsD = abrInsertionRec(r.filsD, z);
				return r;
			}
		}
	}
	
	static Arbre abrInsertionIter(Arbre r, Arbre z) {
		Arbre x,y;
		x = r; y = null;
		
		while(x != null) {
			y = x;
			if(z.key < x.key)
				x = x.filsG;
			x = x.filsD;	
		}
		
		z.pere = y;
		
		if(y == null) {
			r = z; 
		}else {
			if(z.key < y.key)
				y.filsG = z;
			y.filsD = z;
		}
		return r;
	}
	
	static Arbre abrSupprimer(Arbre r, Arbre z) throws Exception {
		if(r == null) {
			throw new Exception("Error");
		}else if(z.key < r.key){
			return(abrSupprimer(r.filsG, z));
		}else if(z.key > r.key) {
			return(abrSupprimer(r.filsD, z));
		}else if(r.filsG == null){
			return(r.filsD);
		}else if(r.filsD == null){
			return(r.filsG);
		}else {
			Arbre m = abrMin(r.filsD);
			m.filsD = r.filsD;
			m.filsG = r.filsG;
			r = m;
			return r;
		}
	}
}
