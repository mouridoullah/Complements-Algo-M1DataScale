package monPackage;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz {

	Scanner clavier = new Scanner(System.in);
	public ConsoleQuiz(int nbreQuestions) {
		super(nbreQuestions);
		// TODO Stub du constructeur généré automatiquement
	}

	@Override
	public void displayMessage(String message) {
		// TODO Stub de la méthode généré automatiquement
		System.out.println(message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
		// TODO Stub de la méthode généré automatiquement
		displayMessage(prompt);
		return clavier.nextLine();
	}

}
