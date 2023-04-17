package ChapterFourteen;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you email address");
        String email = input.nextLine();
        isValidEmail(email);

        System.out.println("Enter your password");
        String password = input.nextLine();
        isValidPassword(password);

        System.out.println("Enter your username");
        String username = input.nextLine();
        isValidUsername(username);

    }
    private static void isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(emailRegex)) {
            System.out.println("Invalid email address: " + email);
        }
        else System.out.println("Email accepted");
    }

    private static void isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%#?&])[A-Za-z\\d@$!%#?&]{8,20}$";
        if (!password.matches(regex)){
            System.out.println("Invalid password : " + password + """
                     Password must have:
                    At least one uppercase letter
                    At least one lowercase letter
                    At least one digit
                    At least one special character
                    Must be between 8 and 20 characters)""");
        }
        else System.out.println("Password accepted");
    }

    private static void isValidUsername(String username) {
        String regex = "^[a-zA-Z0-9_]{3,16}$";
        if (!username.matches(regex)) {
                System.out.println("Invalid username: " + username + """
                         must consisting of:
                        letters, numbers, and underscores with a length between 3 and 16 characters
                        """);
            }
            else System.out.println("Username accepted");
        }
}
