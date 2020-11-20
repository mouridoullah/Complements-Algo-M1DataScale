/**
 * 
 */
package SDA;

/**
 * @author bdame
 *
 */
public class Pile {
	private Liste L = null;
	public boolean estVide(){
		return (L == null);
	}
	public void empiler(int x) {
		L = new Liste(x, L);
	}
	public int depiler() { //suppose que L != null
		int t = L.valeurTete();
		L = L.queue();
		return t;
	}
	public int sommet(){
		return (L.valeurTete());
	}
}
