import java.util.*;

public class FlipCounter {

	public static void main(String[] args) {
		String headsOrTailsGuess = "";
		int numberOfFlips = 0;
		int correctCount = 0;
		int head;
		int tail;
		int i = 0;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a guess, heads or tails: ");
		headsOrTailsGuess = scn.next();
		System.out.print("How many times would you like to flip the coin? ");
		numberOfFlips = scn.nextInt();
		head = headsOrTailsGuess.compareTo("heads");
		tail = headsOrTailsGuess.compareTo("tails");
		
		
		if (head == 0) {
			while (numberOfFlips > i) {
				int rand = (int) Math.round(Math.random());
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
			System.out.println("Invalid guess, please guess heads or tails.");
		}
		
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
		System.out.println("That's " + correctCount * 100 / i + "%.");
		scn.close();
	}
		}
