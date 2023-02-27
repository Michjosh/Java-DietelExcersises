package ChapterThree;
/*Write a Java app that prompts for the person’s information, instantiates an object of class Heart Rates
and prints the information from that object—including the person’s first name,
last name and date of birth—then calculates and prints the person’s age in (years),
maximum heart rate and target heart-rate range.*/

import java.util.Scanner;

public class HeartRateDriver {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        HeartRates myHeartRate = new HeartRates("firstName", "lastName", "DOB");
        System.out.println("Hey there, kindly enter your first name");
        String firstName = entry.nextLine();
        myHeartRate.setFirstName(firstName);

        System.out.println("kindly enter your last name");
        String lastName = entry.nextLine();
        myHeartRate.setLastName(lastName);

        System.out.println("What is your age in years");
        int ageInYears = entry.nextInt();
        myHeartRate.maxHeartRate(ageInYears);

        System.out.println("kindly enter your month of birth: ");
        String monthOfBirth = entry.next();

        System.out.println("kindly enter your day of birth: ");
        String dayOfBirth = entry.next();

        System.out.println("kindly enter your year of birth: ");
        String yearOfBirth = entry.next();

        System.out.printf("%nYour name is %s %s%n", myHeartRate.getFirstName(),myHeartRate.getLastName());
        myHeartRate.methDateOfBirth(monthOfBirth,dayOfBirth,yearOfBirth);
        System.out.printf("%nYou are %d years old", ageInYears);

        System.out.printf("%nYour maximum heart rate is %d%n", myHeartRate.maxHeartRate(ageInYears));
        System.out.printf("Your target heart is %d percent", myHeartRate.targetHeartRate(myHeartRate.maxHeartRate(ageInYears)));

    }
}
