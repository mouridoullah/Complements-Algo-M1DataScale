/**
 * 
 */
package SDA;

/**
 * @author bdame
 *
 */
public class File {
	int[] tab;
	int NMAX;
	int debut;
	int fin;
	
	public File(int n) {
		// TODO Stub du constructeur généré automatiquement
	}
	
	boolean estVide() {
		if(this.debut == this.fin) 
			return true;
		return false;
	}
	
	boolean estPlein() {
		if(this.debut == (this.fin + 1)%NMAX)
			return true;
		return false;
	}
	
	void enfiler(int x) throws Exception {
		if(this.estPlein() == false) {
			this.tab[this.fin] = x;
			this.fin = (this.fin + 1)%NMAX;
		}else {
			throw new Exception("Error");
		}
	}
	
	int defiler() throws Exception {
		int x;
		if(this.estVide() == false) {
			x = this.tab[this.debut];
			this.debut = (this.debut + 1)%NMAX;
		}else {
			throw new Exception("Error");
		}
		return x; 
	}
	
}
