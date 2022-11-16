package chapterThree;

import java.util.Scanner;
		public class LargestSmallest {
		public static void main (String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstnumber = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int secondnumber = input.nextInt();

		System.out.print("Enter third integer: ");
		int thirdnumber = input.nextInt();

		System.out.print("Enter fouth integer: ");
		int fouthnumber = input.nextInt();

		System.out.print("Enter fifth integer: ");
		int fifthnumber = input.nextInt();

		int largest = firstnumber;
       	if (secondnumber > largest)
            largest = secondnumber;
        	if (thirdnumber > largest)
            largest = thirdnumber;
       	if (fouthnumber > largest)
            largest = fouthnumber;
       	if (fifthnumber > largest)
            largest = fifthnumber;

		System.out.printf("Largest is %d\n", largest);

		int smallest = firstnumber;
            if (secondnumber < smallest)
            smallest = secondnumber;
            if (thirdnumber < smallest)
            smallest = thirdnumber;
            if (fouthnumber < smallest)
            smallest = fouthnumber;
       	if (fifthnumber < smallest)
            smallest = fifthnumber;
		
		
		System.out.printf("Smallest is %d\n", smallest);
}
}

