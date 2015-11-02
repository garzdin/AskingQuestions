import java.util.Scanner;

public class OpenQuestion extends Question {
	private String question;
	private String answer;
	private String userAnswer;
	
	public OpenQuestion(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	@Override
	public void askQuestion() {
		System.out.println(this.question);
		Scanner input = new Scanner(System.in);
		this.userAnswer = input.nextLine();
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
