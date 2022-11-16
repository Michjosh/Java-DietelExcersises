package chapterThree;

import java.util.Scanner;
	public class TwoInts {
		public static void main(String [] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter first integer");
		int firstInt = input.nextInt();

		System.out.print("Enter second integer");
		int secondInt = input.nextInt();

		if (firstInt == secondInt)
 		System.out.println("0");
}
}
