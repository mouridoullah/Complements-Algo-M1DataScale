/**
 * 
 */
package myPack;
import java.util.*;
/**
 * @author bdame
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Annén de naissance : ");
			int yearOfBirth = sc.nextInt();
			System.out.println(yearOfBirth);
		}catch(InputMismatchException e) {
			//System.out.println("La date de naissance n'est pas valide.");
			System.out.println("ERREUR : " + e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("yoyo !");
			
		}

	}

}
