package MobilePhoneBook;

import java.util.Scanner;

public class PhonebookApp {
    private static final Scanner entry = new Scanner(System.in);
    private static final PhoneBook myContacts = new PhoneBook("mike", "1234");

    public static void main(String[] args) {
        System.out.println("Kindly enter your password and username to login");
        System.out.println();
        login();

    }

    private static void theMainMenu() {
        String mainMenu = """
                      =========================
                      Welcome to Your Mobile PhoneBook
                      1 -> Create New Contact
                      2 -> Search Contact by Name
                      3 -> View All Contacts
                      4 -> Delete Contact
                      5 -> Count Contacts
                      6 -> Edit Contacts
                      7 -> Exit
                      =========================
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createNewContact();
            case '2' -> SearchContact();
            case '3' -> viewAllContacts();
            case '4' -> deleteContact();
            case '5' -> countContacts();
            case '6' -> editContact();
            case '7' -> exit();
            default -> theMainMenu();
        }
    }

    private static void exit() {
        display("Thank you for using our application");
        myContacts.animatedDisplay("Shorting Down");
        System.exit(1);
    }

    private static void editContact() {
        int entryNumber = Integer.parseInt(input("Enter Contact ID number"));
        String name = input("Enter New contact name");
        String number = input("Enter New contact number");
        String email = input("Enter New email address");
        String home = input("Enter New home address");
        myContacts.editContact(entryNumber, name, number, email, home);
        theMainMenu();
    }

    private static void countContacts() {
        System.out.print("Your Entries Are: ");
        myContacts.countContacts();
        theMainMenu();
    }

    private static void deleteContact() {
        int entryNumber = Integer.parseInt(input("Enter number Id number"));
        myContacts.deleteContact(entryNumber);
        theMainMenu();
    }

    private static void SearchContact() {
        String contactName = (input("Enter name"));
        myContacts.searchContact(contactName);
        theMainMenu();
    }

    private static void viewAllContacts() {
        myContacts.viewContacts();
        theMainMenu();
    }

    private static void createNewContact() {
        String name = input("Enter contact name");
        String number = input("Enter Contact number");
        String email = input("Enter Email address");
        String home = input("Enter Home address");
//        int entryNumber = Integer.parseInt(input("Entry ID Number"));

       myContacts.createContact(name, number, email, home);
        display("Contact Created Successfully");
        theMainMenu();
    }

    private static String input(String prompt) {
//        return JOptionPane.showInputDialog(prompt);
        display(prompt);
        return entry.nextLine();
    }

    private static void display(String prompt) {
//        JOptionPane.showMessageDialog(null, prompt);
        System.out.println(prompt);
    }

    private static void login() {
        String userNameInput = input("Enter Username");
        String passwordInput = input("Enter Password");
        try {
            if (myContacts.getUserName().equalsIgnoreCase(userNameInput) && myContacts.getPassword().equalsIgnoreCase(passwordInput)){
                myContacts.animatedDisplay("Loading");
                System.out.println("Access granted.");
                theMainMenu();
            } else {
                throw new Exception("Incorrect username or password.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
            login();
        }
    }
}