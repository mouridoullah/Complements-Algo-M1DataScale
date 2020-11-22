/**
 * 
 */

/**
 * @author bdame
 *
 */
public class Lampe {
	private boolean etat;

	public Lampe(boolean etat) {
		super();
		this.etat = etat;
	}

	public boolean estAllumee() {
		return etat;
	}

	public void modifierEtat() {
		etat = !etat;
	}
	
}
