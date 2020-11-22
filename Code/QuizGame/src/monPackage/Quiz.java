/**
 * 
 */
package monPackage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author bdame
 *
 */
abstract public class Quiz {
	private int score;
	private long timeElapsed;
	private boolean done = false;
	//private static final int NUMBER_OF_QUESTIONS = 5;
	private int nbreQuestions;
	Scanner scanner = new Scanner(System.in);
	
	public Quiz(int nbreQuestions) {
		// TODO Stub du constructeur généré automatiquement
		this.nbreQuestions = nbreQuestions;
	}
	
	abstract public void displayMessage(String message);
	abstract public String retrieveAnswer(String prompt);
	
	
	public void start() {
		try {
			long startTime = System.currentTimeMillis();
			
			ArrayList<Question> questions = generate(nbreQuestions);
			
			for (Question question : questions) {
				String userAnswer =  retrieveAnswer(question.getText());
		
				
				if (userAnswer.equalsIgnoreCase(question.getResponse())) {
					score++;
					displayMessage("Bonne reponse!");
				}else {
					//score--;
					displayMessage("Oops! Mauvaise reponse!");
					displayMessage("La bonne reponse etait: " + question.getResponse());
				}	
			}
			long endTime = System.currentTimeMillis();
			done = true;
			timeElapsed = endTime - startTime;
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			done = false;
			displayMessage(e.getMessage());
		}
		
	}
	private int getTimeElapsed(long timeMilliseconds) {
		// TODO Stub de la méthode généré automatiquement
		return (int)(timeMilliseconds/1000);
	}
	public void displayResultats() {
		if (done) {
			displayScore();
			displayTimeELapsed();	
		}
	}
	private void displayTimeELapsed() {
		// TODO Stub de la méthode généré automatiquement

		displayMessage(String.format("Il vous a fallu environs %d secondes pour repondre aux %d questions", getTimeElapsed(timeElapsed), nbreQuestions));
	}
	private void displayScore() {
		// TODO Stub de la méthode généré automatiquement
		displayMessage(String.format("Votre score final est de %d/%d\n", score, nbreQuestions));
		
	}
	public ArrayList<Question> generate(int nbreQuestions){
		String[][] data = getData();
		
		if (nbreQuestions > data.length) {
			throw new IllegalArgumentException("Il n'y a que "+ data.length +" questions disponibles.");
		}
		
		ArrayList<Question> question = new ArrayList<>();
		
		int index;
		
		ArrayList<Integer> indexesAlreadyToken = new ArrayList<Integer>();
		indexesAlreadyToken.clear();
		
		for(int i = 0; i < nbreQuestions; ++i) {
			do {
				Random random = new Random();
				index = random.nextInt(data.length);
			}while(indexesAlreadyToken.contains(index));
			
			indexesAlreadyToken.add(index);
			
			String pays = data[index][0];
			String capitale = data[index][1];
			
			String questionText = String.format("Quelle est la capitale de ce pays: %s ??", pays);
			
			question.add(new Question(questionText, capitale));
		}
		return question;
	}
	private static String[][] getData(){
		String[][] data = {
				{"Senegal","Dakar"},{"France","Paris"},{"Nigeria","Abuja"},
				{"Italie","Rome"},{"Perou","Lima"},{"Monaco","Monaco"},
				{"Allemagne","Berlin"},{"Liberia","Monrovia"},{"Gabon","Libreville"}
		};
		return data;
	}

}
