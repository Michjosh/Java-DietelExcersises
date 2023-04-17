package Practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth to know your age: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println(calculateAge1(dateOfBirth));

    }
    public static int calculateAge(String dateOfBirthStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public static int calculateAge1(String dateOfBirth){
        return Period.between(LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalDate.now()).getYears();
    }
}
