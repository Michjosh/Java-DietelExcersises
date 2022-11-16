package chapterThree;

import java.util.Scanner;

	public class Energy {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		double constant = 4184;

		System.out.print("Enter the amount of water in kilograms");
		double M = input.nextDouble();

		System.out.print("Enter the initial temperature");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter the final temperature");
		double finalTemperature = input.nextDouble();

		double Q = M * (finalTemperature - initialTemperature) * constant;

		System.out.println("The energy needed is "  + Q);
}
} 
		
		