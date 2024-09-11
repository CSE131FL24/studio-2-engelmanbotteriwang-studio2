package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Select start amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Select win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Select win limit for a successful day: ");
		double winLimit = in.nextDouble();
		int totalSimulations = 1;

		while (startAmount < winLimit && startAmount > 0) {
			double random = (int) (Math.random() * 100 + 1);
			if (winChance > random) {
				System.out.print("Simulation " + totalSimulations + ": Win");
				startAmount = startAmount + 1;
			} else {
				System.out.print("Simulation " + totalSimulations + ": Loss");
				startAmount = startAmount - 1;
			}
			System.out.println();
			totalSimulations = totalSimulations + 1;
		}
		if (startAmount >= winLimit) {
			System.out.print("Stop Gambling, Winner!  ");
		} else if (startAmount == 0) {
			System.out.print("The day was a ruin.  ");
		}
		System.out.print("You played a total of " + totalSimulations + " games");
	}

}
