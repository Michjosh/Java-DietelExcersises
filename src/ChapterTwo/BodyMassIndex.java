package ChapterTwo;

import java.util.Scanner;

/*Create a BMI calculator that reads the user’s weight in pounds and height in inches
(or, if you prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
 body mass index. Also, display the BMI categories and their values from the National Heart Lung
 and Blood Institute so the user can evaluate his/her BMI.*/
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Hey there, kindly enter your body weight in Kilograms");
        double weight = entry.nextDouble();

        System.out.println("Enter your height in meters");
        double height = entry.nextDouble();

        double bodyMassIndex = weight / (height * height);

        if (bodyMassIndex < 18.5 ) {
            System.out.println("Your BMI is less 18.5 so your under weight");
        }
        if ((bodyMassIndex >= 18) && (bodyMassIndex <= 24.9)){
            System.out.println("Your BMI is 24.9 so you have a normal weight");
        }
        if ((bodyMassIndex >= 25.0) && (bodyMassIndex <= 29.9)) {
            System.out.println("Your BMI is 29.9 so you are over weight");
        }
        if ((bodyMassIndex >= 30.0) && (bodyMassIndex <= 34.9)) {
            System.out.println("Your BMI is 34.9 so you are Obese (Class I)");
        }
        if ((bodyMassIndex >= 35.0) && (bodyMassIndex <= 39.9)) {
            System.out.println("Your BMI is 39.9, so you are Obese (Class II)");
        }
        if (bodyMassIndex >= 40.0) {
            System.out.println("Your BMI is above 40, so you are obese (Class III");
        }
        System.out.println("\t\n" +
                "BMI Categories:\n" +
                "Underweight = <18.5\n" +
                "Normal weight = 18.5–24.9\n" +
                "Overweight = 25–29.9\n" +
                "Obesity = BMI of 30 or greater");
    }

}
