package ChapterTwo;

import java.util.Scanner;

	public class Minutes{
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the number of minutes");
		long minutes = input.nextLong();

		long years = minutes / 525600;
		long days = (minutes % 525600) / 1440;

		System.out.println(minutes + " is approximately " + years +" years and " + days + " days" );
}
} 
		
		