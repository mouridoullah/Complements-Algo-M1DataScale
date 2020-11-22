import java.io.Serializable;

/**
 * 
 */

/**
 * @author bdame
 *
 */
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6744868687362209098L;
	
	private int id;
	//private transient int id; // Pour ne pas serialiser un attribut
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Student ~ [id: #%d, name: %s]", id, name);
	}
}
