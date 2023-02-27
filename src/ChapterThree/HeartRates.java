package ChapterThree;
 /*Create a class called HeartRates. The class attributes should include the person’s first name,
last name and date of birth (consisting of separate attributes for the month, day and year of birth).
Your class should have a constructor that receives this data as parameters.
For each attribute provide set and get methods. The class also should include a method that calculates
and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate
and a method that calculates and returns the person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class Heart Rates
and prints the information from that object—including the person’s first name,
last name and date of birth—then calculates and prints the person’s age in (years),
maximum heart rate and target heart-rate range.*/

public class HeartRates {

    private String firstName;
    private String lastName;
    private String dateOfBirth = "month, day, year";

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void methDateOfBirth(String month, String day, String year) {
        System.out.printf("You were born in %s %s %s", month, day, year);
    }
    public int ageCalculator(int currentYear, int birthYear){
        return currentYear - birthYear;
    }
    public int maxHeartRate(int ageInYears){
        return 220 - ageInYears;
    }
    public int targetHeartRate(int maxHeartRate){
        return (int) (0.85 * maxHeartRate);
    }
}
