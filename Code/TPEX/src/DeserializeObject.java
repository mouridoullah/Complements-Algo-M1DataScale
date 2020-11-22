import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author bdame
 *
 */
public class DeserializeObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Deserialization
		 */
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.ser"))) 
		{
			//Student student1 = (Student)inputStream.readObject();
			//Student student2 = (Student)inputStream.readObject();
			//int a = inputStream.readInt();
			//Student student3 = (Student)inputStream.readObject();
			
			//System.out.println(student1);
			//System.out.println(student2);
			//System.out.println(a);
			//System.out.println(student3);
			
			Student[] students = (Student[])inputStream.readObject();
			ArrayList<Student> studentList = (ArrayList<Student>)inputStream.readObject();
			
			for (Student student : students) {
				System.out.println(student);
			}
			System.out.println();
			for (Student student : studentList) {
				System.out.println(student);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
