/**
 * 
 */

/**
 * @author bdame
 *
 */
public class CalculatriceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.additionner(2,3,4,5,4,5);
		System.out.println(calculatrice.getResultat());
		calculatrice.soustraire(2,3,3,5,4,5);
		System.out.println(calculatrice.getResultat());
		calculatrice.multiplier(2,1,4,5,4,5);
		System.out.println(calculatrice.getResultat());
	}

}
