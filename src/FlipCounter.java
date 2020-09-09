import java.util.*;

public class FlipCounter {

	public static void main(String[] args) {
		String headsOrTailsGuess = "";
		int numberOfFlips = 0;
		int correctCount = 0;
		int head;//it seams like there may be *many* ways to do this, chose this one since it came up first via google, but there are probably better ways of doing this comparison
		int tail;
		int i = 0; //created to compare loop through number of flips
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a guess, heads or tails: ");
		headsOrTailsGuess = scn.next();
		System.out.print("How many times would you like to flip the coin? ");
		numberOfFlips = scn.nextInt();
		head = headsOrTailsGuess.compareTo("heads");
		tail = headsOrTailsGuess.compareTo("tails");
		
		
		if (head == 0) {
			while (numberOfFlips > i) {
				int rand = (int) Math.round(Math.random());//rounded the double to cast to int, still will be randomly generated
				if (rand % 2 == 0.0) {
					System.out.println("heads");
					correctCount++;
					i++;
					} else {
					System.out.println("tails");
					i++;
			}
		}
			} else if (tail == 0) {
			while (numberOfFlips > i) {
				int rand = (int) Math.round(Math.random());
				if (rand % 2 == 0.0) {
					System.out.println("heads");
					i++;
					} else {
					System.out.println("tails");
					correctCount++;
					i++;
			}
		}
			} else {
			System.out.println("Invalid guess, please guess heads or tails.");//typo reminder, does not stop later exception if typo is entered
		}
		
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
		System.out.println("That's " + correctCount * 100 / numberOfFlips + "%.");//*100 first because correctCount / numberOfFlips is less than 1, which rounds up to 0 for variable type int
		scn.close();
	}
		}
