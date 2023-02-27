/*You are given a password variable as an argument, which is assigned to a
string representation of the password. Complete function isSafe so that it
will confirm if the password meets the following criteria:
• Length: The length of the password is greater than or equal to six characters.
• Uppercase letter: The password contains at least one uppercase alphabet (A-Z).
• Lowercase letter: The password contains at least one lowercase alphabet (a-z).
• Numeric digit: The password contains at least one digit (0-9).
• Special Character: The password contains at least one special character (any character other than
{0-9, a-z, A-Z}).
Given the above factors, use RegExes and its test method to return a boolean if true the password
meets the above criteria. It will return false if it does not.*/
package Practice;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = entry.nextLine();
        System.out.println(isSafe(password));
    }
    public static boolean isSafe(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\da-zA-Z]).{6,}$";
        return password.matches(regex);
    }

}
