package monPackage;

import javax.swing.JOptionPane;

public class GUIQuiz extends Quiz {

	public GUIQuiz(int nbreQuestions) {
		super(nbreQuestions);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public void displayMessage(String message) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		JOptionPane.showMessageDialog(null, message);
		
	}

	@Override
	public String retrieveAnswer(String prompt) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return JOptionPane.showInputDialog(prompt);
	}

}
