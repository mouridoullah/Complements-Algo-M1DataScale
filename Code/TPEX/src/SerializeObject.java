import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * 
 */

/**
 * @author bdame
 *
 */
public class SerializeObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Student mamadou = new Student(21901591, "Mamadou");
		//Student mouridoullah = new Student(21901592, "Mouridoullah");
		//Student bayeDame = new Student(21901593, "BayeDame");
		
		Student[] students = {new Student(21901591, "Mamadou"),new Student(21901592, "Mouridoullah"),new Student(21901593, "BayeDame")};
		ArrayList<Student> studentList  = new ArrayList<>(Arrays.asList(students));
		
		/*
		 * Serialization
		 */
		  try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.ser"))) 
		{
			  /*--------Serialize un object Student-------*/
			//objectOutputStream.writeObject(mouridoullah);
			//objectOutputStream.writeObject(mamadou);
			//objectOutputStream.writeInt(256421);
			//objectOutputStream.writeObject(bayeDame);
			  
			  /*--------Serialize un tab et ArrayList-------*/
			  objectOutputStream.writeObject(students);
			  objectOutputStream.writeObject(studentList);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
