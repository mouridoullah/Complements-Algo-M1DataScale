import java.util.Scanner;

/**
 * 
 */

/**
 * @author bdame
 *
 */
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.print("A :"); int a = clavier.nextInt();
		System.out.print("B :"); int b = clavier.nextInt();
		int c = 0;
		try {
		c = a/b;
		System.out.print("C :" + c); 
		}catch(ArithmeticException e) {
			System.out.println("Division par 0 !! Impossible ");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
