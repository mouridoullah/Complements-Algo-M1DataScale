/**
 * 
 */

/**
 * @author bdame
 *
 */
public class HeritageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		
		//Enfant enfant = new Enfant();
		//System.out.println(new Enfant().nombreDeTetes());
		
		Forme[] tab = new Forme[3];
		
		Forme forme1 = new Carre(); 
		Forme forme2 = new Triangle(); 
		Forme forme3 = new Cercle(); 
		
		tab[0] = forme1; tab[1] = forme2; tab[2] = forme3;
		
		for (Forme forme : tab) {
			System.out.println(forme.aire());
		}
		
		new Carre();
		
		Chat chat = new Chat();
		Chien chien = new Chien();
		chat.communiquer();
		chien.communiquer();
	}

}
