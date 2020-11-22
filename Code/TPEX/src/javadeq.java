/**
 * 
 */

/**
 * @author bdame
 *
 */
import java.io.*;
import java.util.*;

public class javadeq {

	class my {
		// this will be public
		int a;

		my(int k) {
			a = k;
		}

		int get() {
			return a;
		}
	}

	/*
	 * public static void main (String[] args) { javadeq prog=new javadeq();
	 * prog.run(); }
	 */
	void run() {

		Deque<my> dq = new LinkedList<my>();

		my m = new my(10);
		dq.addFirst(m);
		// careful about this. always make a new item to push. its a pointer
		dq.addFirst(m);
		m = new my(11);
		dq.addLast(m);

		while (dq.isEmpty() == false) {
			m = dq.removeFirst();
			System.out.println(m.a);
		}

	}
	 public static void main (String[] args) { 
		 javadeq prog=new javadeq();
		 prog.run(); 
	 }
}