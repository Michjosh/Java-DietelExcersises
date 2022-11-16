package chapterThree;/*2.26 (Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.]*/


import java.util.Scanner; 
		public class Multiples {
		public static void main (String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstnumber = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int secondnumber = input.nextInt();

		int firstnumbertrippled = firstnumber * 3;
		System.out.printf("%d = %d%n", firstnumbertrippled, firstnumber);

		int secondnumberdoubled = secondnumber * 2;
		System.out.printf("%d = %d%n", secondnumberdoubled, secondnumber);

		if ((firstnumbertrippled % secondnumberdoubled) == 0) {
 		System.out.println("Yes! " + firstnumbertrippled + " is a multiple of " + secondnumberdoubled + "!");
}
		else {
            System.out.println("No! " + firstnumbertrippled + " is not a multiple of " + secondnumberdoubled + "!");
}		
		 
}
}