package monPackage;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz {

	Scanner clavier = new Scanner(System.in);
	public ConsoleQuiz(int nbreQuestions) {
		super(nbreQuestions);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public void displayMessage(String message) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		System.out.println(message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		displayMessage(prompt);
		return clavier.nextLine();
	}

}
