
import java.util.Scanner;

public class IntegerQuestion extends Question {
	private String question;
	private int answer;
	private int userAnswer;
	
	public IntegerQuestion(String question, int answer) {
		this.question = question;
		this.answer = answer;
	}
	
	@Override
	public void askQuestion() {
		System.out.println(this.question);
		Scanner input = new Scanner(System.in);
		this.userAnswer = input.nextInt();
		checkQuestion();
		input.close();
	}
	
	@Override
	public boolean checkQuestion() {
		if(this.userAnswer == this.answer) {
			System.out.println("Correct");
			return true;
		}
		else
		{
			System.out.println("Incorrect");
			return false;
		}
	}
}
