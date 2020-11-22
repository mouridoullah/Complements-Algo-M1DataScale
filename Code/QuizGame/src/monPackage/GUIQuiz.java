package monPackage;

import javax.swing.JOptionPane;

public class GUIQuiz extends Quiz {

	public GUIQuiz(int nbreQuestions) {
		super(nbreQuestions);
		// TODO Stub du constructeur généré automatiquement
	}

	@Override
	public void displayMessage(String message) {
		// TODO Stub de la méthode généré automatiquement
		JOptionPane.showMessageDialog(null, message);
		
	}

	@Override
	public String retrieveAnswer(String prompt) {
		// TODO Stub de la méthode généré automatiquement
		return JOptionPane.showInputDialog(prompt);
	}

}
