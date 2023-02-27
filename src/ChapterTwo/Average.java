package ChapterTwo;

import java.util.Scanner;
	public class Average {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		float V0, V1, t;

		System.out.print("Enter V0 ");
		V0 = input.nextFloat();

		System.out.println("Enter V1");
		V1 = input.nextFloat();

		System.out.println("Enter t");
		t = input.nextFloat();
		

		float average = V1 - V0/t;
		System.out.println("The Average acceleration is "  + average);
}
} 
		
		