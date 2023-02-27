package NoteBook;

import java.util.Scanner;

public class EDiary {

    private static final Scanner entry = new Scanner(System.in);
    private static final Diary myDiary = new Diary();

    public static void main(String[] args) {
        System.out.println("Kindly enter your password and username to login");
        System.out.println();
        login();

    }

    private static void theMainMenu() {
        String mainMenu = """
                      =========================
                      Welcome to Your Smart E-diary
                      1 -> Create New Entry
                      2 -> View Entry
                      3 -> View All entries
                      4 -> Delete Entry
                      5 -> Count Entries
                      6 -> Edit Entry
                      7 -> Exit
                      =========================
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createNewEntry();
            case '2' -> viewEntry();
            case '3' -> viewAllEntry();
            case '4' -> deleteNewEntry();
            case '5' -> countEntry();
            case '6' -> editEntry();
            case '7' -> exit();
            default -> theMainMenu();
        }
    }

    private static void exit() {
        display("Thank you for using our application");
        myDiary.animatedDisplay("Shorting Down");
        System.exit(1);
    }

    private static void editEntry() {
        int entryNumber = Integer.parseInt(input("Enter your entry number"));
        String title = input("Enter New Title Of Entry");
        String body = input("Enter New Body of diary");

        myDiary.editEntry(entryNumber, title, body);
        theMainMenu();
    }

    private static void countEntry() {
        System.out.print("Your Entries Are: ");
        myDiary.countEntries();
        theMainMenu();
    }

    private static void deleteNewEntry() {
        int entryNumber = Integer.parseInt(input("Enter your entry number"));
        myDiary.deleteEntry(entryNumber);
        theMainMenu();
    }

    private static void viewEntry() {
        int entryNumber = Integer.parseInt(input("Enter your entry number"));
        myDiary.viewEntry(entryNumber);
        theMainMenu();
    }

    private static void viewAllEntry() {
        myDiary.viewAllEntries();
        theMainMenu();
    }

    private static void createNewEntry() {
        String title = input("Enter Title Of Entry");
        String body = input("Enter Body of Diary");
//        int entryNumber = Integer.parseInt(input("Entry ID Number"));

        myDiary.createEntry(title, body);
        display("Entry Created Successfully");
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
            if (myDiary.getUserName().equalsIgnoreCase(userNameInput) && myDiary.getPassword().equalsIgnoreCase(passwordInput)){
                myDiary.animatedDisplay("Loading");
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
