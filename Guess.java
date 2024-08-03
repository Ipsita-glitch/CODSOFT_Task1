import java.util.Scanner;

public class Guess {

	public static void
	guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());
		int g = 4;
		int i, guess;
		System.out.println("A Number Is Chosen between 1 to 100."+"Guess the number"+" within 4 trials.");
		for (i = 0; i < g; i++) 
		{
			System.out.println("Guess the no.:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println(" Yess guessed no. is correct.");
				break;
			}
			else if (number > guess && i != g - 1) {
				System.out.println("The no. is greater than " + guess);
			}
			else if (number < guess && i != g - 1) {
				System.out.println("The no. is less than " + guess);
			}
		}
		if (i == g) {
			System.out.println("K trials completed");
			System.out.println("The no. was " + number);
		}
	}

	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}