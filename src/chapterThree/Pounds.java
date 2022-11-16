package chapterThree;

import java.util.Scanner;

	public class Pounds {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		double pounds_to_kilo = 0.454;

		System.out.print("Enter a number in pounds ");
		double pounds = input.nextFloat();

		double kilograms = pounds * pounds_to_kilo;

		System.out.println(pounds + " pounds is "  + kilograms + " kilograms");
}
} 
		
		