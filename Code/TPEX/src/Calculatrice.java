/**
 * 
 */

/**
 * @author bdame
 *
 */
public class Calculatrice {
	private double resultat;
	
	public void additionner(double... nombres) {
		effectuer('+', nombres);
	}

	public void soustraire(double... nombres) {
		effectuer('-', nombres);
	}
	
	public void multiplier(double... nombres) {
		effectuer('*', nombres);
	}
	
	private void effectuer(char symbole, double... nombres) {
		for (double nombre : nombres) {
			calculer(symbole, nombre);
		}
	}

	private void calculer(char symbole, double nombre) {
		switch (symbole) {
		case '+': {
			
			resultat += nombre;
			break;
		}
		case '-': {
			
			resultat -= nombre;
			break; 
		}
		case '*': {
			
			resultat *= nombre;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + symbole);
		}
	}
	public double getResultat() {
		return resultat;
	}

}
