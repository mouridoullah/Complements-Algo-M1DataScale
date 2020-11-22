import java.util.InputMismatchException;
import java.util.Scanner;

/**
	 * 
	 */
	
	/**
	 * @author bdame
	 *
	 */
public class App2 {
	
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub s
		try {
			Scanner clavier = new Scanner(System.in);
			System.out.print("Code :"); 
			int c = clavier.nextInt();
			System.out.print("Solde :"); 
			float s = clavier.nextFloat();
			Compte cp = new Compte(c ,s);
			System.out.print("Montant à verser :"); 
			float mt1 = clavier.nextFloat();
			cp.verser(mt1);
			System.out.print("Montant à retirer :"); 
			float mt2 = clavier.nextFloat();
			cp.retirer(mt2);
			System.out.println("Solde est : " +cp.getSolde());
		}catch(SoldeInsuffisantException e) {
			System.out.println(e.getMessage());
		}catch(NegativeExecption e){
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Probleme de saisie ");
		}
		finally {
			System.out.println("yoyo !!");
		}
	}		
}

	
