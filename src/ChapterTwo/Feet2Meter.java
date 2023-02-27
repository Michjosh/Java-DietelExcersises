package ChapterTwo;

import java.util.Scanner;

	public class Feet2Meter{
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		double feet_meter = 0.305;

		System.out.print("Enter a value for feet");
		double feet = input.nextDouble();

		double meter = feet * feet_meter;
		System.out.println(feet + " feet is "  + meter + " meters");
}
} 
		
		