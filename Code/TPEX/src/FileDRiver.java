import java.io.File;

/**
 * 
 */

/**
 * @author bdame
 *
 */
public class FileDRiver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("c:/");
		
		String[] contenu = file.list();
		 
		for (String str : contenu) {
			File fle = new File("c:/" +str);
			if (fle.isDirectory()) {
				System.out.println("Rep : "+fle);
			}else {
				System.out.println("File : "+fle);
		    }
		}
	}

}
