/**
 * 
 */

/**
 * @author bdame
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		Lampe lampe =  new Lampe(false);
		Interrupteur interrupteur = new Interrupteur(lampe);
		
		System.out.println(lampe.estAllumee());
		System.out.println(interrupteur.getPosition());
		
		interrupteur.changerPosition();
		
		System.out.println(lampe.estAllumee());
		System.out.println(interrupteur.getPosition());
		
		interrupteur.changerPosition();
		
		System.out.println(lampe.estAllumee());
		System.out.println(interrupteur.getPosition());

	}

}
