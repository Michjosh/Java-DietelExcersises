package ChapterTwo;

import java.util.Scanner;
import java.lang.Math;
	public class Area {
		public static void main(String [] args) {
		
		
		Scanner input = new Scanner(System.in);
		double side1, side2, side3, xone, xtwo, xthree, yone, ytwo, ythree;

		System.out.println("Enter the first pair of vertices: ");
		xone = input.nextDouble();
		yone = input.nextDouble();

		System.out.println("Enter the second pair of vertices: ");
		xtwo = input.nextDouble();
		ytwo = input.nextDouble();

		System.out.println("Enter the third pair of vertices: ");
		xthree = input.nextDouble();
		ythree = input.nextDouble();

		
		side1 = Math.sqrt(Math.pow(xthree - xone, 2) + Math.pow(ythree - yone, 2));

		side2 = Math.sqrt(Math.pow(xtwo - xone, 2) + Math.pow(ytwo - yone, 2));

		side3 = Math.sqrt(Math.pow(xthree - xtwo, 2) + Math.pow(ythree - ytwo, 2));
		
		double s = (side1 + side2 + side3)/2;

		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));


		//System.out.println("The area of the triangle is "  + area);

		System.out.printf("The area of the triangle is %.2f" , area);

		
}
} 
		