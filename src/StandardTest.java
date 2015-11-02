import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class StandardTest implements Testing {
	private String[] arr;
	int correctAnswers;
	
	public void performTest() {
		
	}
	
	@Override
	public void loadQuestions() {
		arr[0] = "What's your name?";
		arr[1] = "How old are you?";
		arr[2] = "Where do you come from?";
		arr[3] = "Where do you live?";
		arr[4] = "What languages do you speak";
		arr[5] = "What's your favorite food?";
		arr[6] = "What do you like to do in your free time?";
	}
	
	@Override
	public void scrambleQuestions() {
		Random rnd = ThreadLocalRandom.current();
	    for (int i = arr.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      if(index >= 0 && index <= arr.length) {
	    	  String a = arr[index];
		      arr[index] = arr[i];
		      arr[i] = a;
	      }
	    }
	}
}
