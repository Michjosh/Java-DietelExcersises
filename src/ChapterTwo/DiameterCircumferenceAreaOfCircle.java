package ChapterTwo;
/* Write an application that inputs from the user the radius of a circle
as an integer and prints the circle’s diameter, circumference and area using the floating-point value
3.14159 for π.*/

import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = entry.nextInt();

        System.out.printf("%n The diameter is %d ",  (2 * radius));
        System.out.printf("%n Circumference is %.2f ", (2 * (Math.PI*radius)));
        System.out.printf("%n Area is %.2f%n", (Math.PI*(radius*radius)));
    }
}
