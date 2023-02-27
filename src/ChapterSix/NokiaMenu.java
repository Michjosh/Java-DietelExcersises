package ChapterSix;

import java.util.Scanner;

public class NokiaMenu {

        public static void main(String[] args) {

            Scanner entry = new Scanner(System.in);
            int menu;
            printMenu();
            menu = entry.nextInt();
            switch (menu) {
                case 1 -> phoneBook();
                case 2 -> message();
                case 3 -> chat();
                case 4 -> callRegister();
                case 5 -> tones();
                case 6 -> settings();
                case 7 -> callDivert();
                case 8 -> games();
                case 9 -> calender();
                case 10 -> reminder();
                case 11 -> clock();
                case 12 -> profile();
                case 13 -> SimService();
                case 14 -> exit();
                default -> System.out.println("Enter a valid number");
            }
        }

        private static void SimService() {
            System.out.println("""
                Sim Service
                1: Back to main menu
                2: Exit""");
            Scanner entry = new Scanner(System.in);
            int sim = entry.nextInt();
            switch (sim) {
                case 1 -> backToMainMenu();
                case 2 -> exit();
            }

        }

        private static void profile() {
            System.out.println("""
                Profile
                1: Back to main menu
                2: Exit menu""");
            Scanner ile = new Scanner(System.in);
            int profile = ile.nextInt();
            switch (profile) {
                case 1 -> backToMainMenu();
                case 2 -> exit();
            }

        }

        private static void clock() {
            System.out.println("""
                Clock
                1: Alarm clock
                2: Clock
                3: Date settings
                4: Stopwatch
                5: Countdown timer
                6: Auto update of date and time
                7: Back to main menu
                8: Exit Menu""");
            Scanner ock = new Scanner(System.in);
            int clock = ock.nextInt();
            switch (clock) {
                case 1 -> System.out.println("Alarm clock");
                case 2 -> System.out.println("Clock");
                case 3 -> System.out.println("Date settings");
                case 4 -> System.out.println("Stopwatch");
                case 5 -> System.out.println("Countdown timer");
                case 6 -> System.out.println("Auto update of date and time");
                case 7 -> backToMainMenu();
                case 8 -> exit();
            }
        }

        private static void reminder() {
            System.out.println("""
                Reminders
                1: Back to main menu
                2: Exit""");
            Scanner remind = new Scanner(System.in);
            int reminders = remind.nextInt();
            switch (reminders) {
                case 1 -> backToMainMenu();
                case 2 -> exit();
            }

        }

        private static void calender() {
            System.out.println("""
                Calender
                1: Back to main menu
                2: Exit menu""");
            Scanner der = new Scanner(System.in);
            int calender = der.nextInt();
            switch (calender) {
                case 1 -> backToMainMenu();
                case 2 -> exit();
            }
        }

        private static void games() {
            System.out.println("""
                Games
                1: Back to main menu
                2: Exit""");
            Scanner gm = new Scanner(System.in);
            int games = gm.nextInt();
            switch (games) {
                case 1 -> backToMainMenu();
                case 2 -> exit();
            }
        }

        private static void callDivert() {
            System.out.println("""
                Call divert
                1: Back to main menu
                2: Exit""");
            Scanner div = new Scanner(System.in);
            int divert = div.nextInt();
            switch (divert) {
                case 1 -> backToMainMenu();
                case 2 -> exit();
            }
        }

        private static void settings() {
            System.out.println("""
                Settings
                1: Call settings
                2: Phone settings
                3: Security settings
                4: Restore factory settings
                5: Back to main menu
                6: Exit menu""");
            Scanner entry = new Scanner(System.in);
            int sett = entry.nextInt();
            switch (sett) {
                case 1:
                    System.out.println("""
                        Call settings
                        1: Automatic redial
                        2: Speed dialling
                        3: Call waiting options
                        4: Own number sending
                        5: Phone line in us
                        6: Automatic answer
                        7: Back to main menu
                        8: Exit""");
                    Scanner scs = new Scanner(System.in);
                    int all = scs.nextInt();
                    switch (all) {
                        case 1 -> System.out.println("Automatic redial");
                        case 2 -> System.out.println("Speed dial");
                        case 3 -> System.out.println("Call waiting options");
                        case 4 -> System.out.println("Own number sending");
                        case 5 -> System.out.println("Phone line in use");
                        case 6 -> System.out.println("Automatic answer");
                        case 7 -> backToMainMenu();
                        case 8 -> exit();
                    }
                case 2:
                    System.out.println("""
                        Phone Settings
                        1: Language
                        2: Cell info display
                        3: Welcome note
                        4: Network selection
                        5: lights
                        6: Confirm Sim service actions
                        7: Back to main menu
                        8: Exit menu""");
                    Scanner one = new Scanner(System.in);
                    int phone = one.nextInt();
                    switch (phone) {
                        case 1 -> System.out.println("Language");
                        case 2 -> System.out.println("Cell info display");
                        case 3 -> System.out.println("Welcome note");
                        case 4 -> System.out.println("Network selection");
                        case 5 -> System.out.println("lights");
                        case 6 -> System.out.println("Confirm Sim service actions");
                        case 7 -> backToMainMenu();
                        case 8 -> exit();
                    }
                case 3:
                    System.out.println("""
                        Security settings
                        1: PIN code request
                        2: Call barring service
                        3: Fixed dialling
                        4: Closed user group
                        5: Phone security
                        6: Change access codes
                        7: Back to main menu
                        8: Exit""");
                    Scanner sec = new Scanner(System.in);
                    int security = sec.nextInt();
                    switch (security) {
                        case 1 -> System.out.println("PIN code request");
                        case 2 -> System.out.println("Call barring service");
                        case 3 -> System.out.println("Fix dialling");
                        case 4 -> System.out.println("Closed user group");
                        case 5 -> System.out.println("Phone security");
                        case 6 -> System.out.println("Change access codes");
                        case 7 -> backToMainMenu();
                        case 8 -> exit();
                    }
                case 4:
                    System.out.println("""
                        Restore factory settings
                        1: Back to main menu
                        2: Exit""");
                    Scanner tore = new Scanner(System.in);
                    int restore = tore.nextInt();
                    switch (restore) {
                        case 1 -> backToMainMenu();
                        case 2 -> exit();
                    }
            }
        }

        private static void tones() {
            System.out.println("""
                1: Ringing tone
                2: Ringing volume
                3: Incoming call alert
                4: Composer
                5: Message alert tone
                6: Keypad tones
                7: Warning and game tones
                8: Vibrating alert
                9: Screen saver
                10: Back to main menu
                11: Exit menu""");
            Scanner entry = new Scanner(System.in);
            int tones = entry.nextInt();
            switch (tones) {
                case 1 -> System.out.println("Ringing tone");
                case 2 -> System.out.println("Ringing volume");
                case 3 -> System.out.println("Incoming call alert");
                case 4 -> System.out.println("Message alert tone");
                case 5 -> System.out.println("keypad tones");
                case 6 -> System.out.println("Warning and game tones");
                case 7 -> System.out.println("Vibrating alert");
                case 8 -> System.out.println("Screen saver");
                case 9 -> backToMainMenu();
                case 10 -> exit();
            }
        }

        private static void callRegister() {
            System.out.println("""
                Call Register
                1: Missed calls
                2: Received call
                3: Dialled numbers
                4: Erase recent call list
                5: Show call duration
                6: Show call cost
                7: Call cost settings
                8: Prepaid credit
                9: Back to main menu
                10: Exit menu""");
            Scanner entry = new Scanner(System.in);
            int call = entry.nextInt();
            switch (call) {
                case 1: System.out.println("missed calls");
                    break;
                case 2: System.out.println("received calls");
                    break;
                case 3: System.out.println("Dialled numbers");
                    break;
                case 4: System.out.println("Erase recent call lists");
                    break;
                case 5: System.out.println("""
                        Show call duration
                        1: Last call duration
                        2: All calls' cost
                        3: Received calls' duration
                        4: Dialled calls' duration
                        5: Clear timers
                        6: Back to main menu
                        7: Exit""");
                    Scanner e = new Scanner(System.in) ;
                    int duration = e.nextInt();
                    switch (duration) {
                        case 1 -> System.out.println("last call duration");
                        case 2 -> System.out.println("All calls cost");
                        case 3 -> System.out.println("Received calls' duration");
                        case 4 -> System.out.println("Dialled calls' duration");
                        case 5 -> System.out.println("clear timers");
                        case 6 -> backToMainMenu();
                        case 7 -> exit(); }
                case 6: System.out.println("""
                        Show call cost
                        1: last call cost
                        2: All calls' cost
                        3: Clear counters
                        4: Back to main menu
                        5: Exit menu""");
                    Scanner sc = new Scanner(System.in);
                    int cost = sc.nextInt();
                    switch (cost) {
                        case 1 -> System.out.println("Last call cost");
                        case 2 -> System.out.println("All calls' cost");
                        case 3 -> System.out.println("Clear counters");
                        case 4 -> backToMainMenu();
                        case 5 -> exit();
                    }
                case 7: System.out.println("""
                        Call cost settings
                        1: Call cost limit
                        2: Show costs in
                        3: Back to main menu
                        4: Exit menu""");
                    Scanner s = new Scanner(System.in);
                    int set = s.nextInt();
                    switch (set) {
                        case 1 -> System.out.println("call cost limit");
                        case 2 -> System.out.println("Show costs in");
                        case 3 -> backToMainMenu();
                        case 4 -> exit();
                    }
                case 8: System.out.println("Prepaid credit");
                    break;
            }
        }
        private static void chat() {
            System.out.println("""
                Chat
                1: Back to main menu
                2: Exit""");
            Scanner entry = new Scanner(System.in);
            int cha = entry.nextInt();
            switch (cha) {
                case 1: backToMainMenu();
                case 2: exit();
            }
        }
        private static void exit() {
            System.out.println("Thank you, you have exited");
            System.exit(1);
        }
        private static void message() {
            System.out.println("""
                Press 1-10 to select an option
                Message
                1: Write message
                2: Inbox
                3: Outbox
                4: Picture message
                5: Templates
                6: Smileys
                7: Message settings
                8: Info service
                9: Voice mailbox number
                10: Service command editor
                11: Back to main menu
                11: Exit""");
            Scanner entry = new Scanner(System.in);
            int userInput = entry.nextInt();
            switch (userInput) {
                case 1 -> System.out.println("Write message");
                case 2 -> System.out.println("Inbox");
                case 3 -> System.out.println("Outbox");
                case 4 -> System.out.println("Picture messages");
                case 5 -> System.out.println("Templates");
                case 6 -> System.out.println("Smileys");
                case 7 -> {
                    System.out.println("""
                        Message settings
                        1: Set 1
                        2: Common
                        3: Back to main menu
                        4: Exit""");
                    int se = entry.nextInt();
                    switch (se) {
                        case 1 -> {
                            System.out.println("""
                                Set 1
                                1: Message center number
                                2: Message sent as
                                3: Message validity
                                4: Back to main menu
                                5: Exit""");
                            Scanner et = new Scanner(System.in);
                            int set = et.nextInt();
                            switch (set) {
                                case 1 -> System.out.println("Message center number");
                                case 2 -> System.out.println("Message sent as");
                                case 3 -> System.out.println("Message validity");
                                case 4 -> backToMainMenu();
                                case 5 -> exit();
                            }
                        }
                        case 2 -> {
                            System.out.println("""
                                Common
                                1: Delivery reports
                                2: Reply via same centre
                                3: Character support
                                4: Back to main menu
                                5: Exit""");
                            Scanner mon = new Scanner(System.in);
                            int common = mon.nextInt();
                            switch (common) {
                                case 1 -> System.out.println("Delivery reports");
                                case 2 -> System.out.println("Reply via some centre");
                                case 3 -> System.out.println("Character support");
                                case 4 -> backToMainMenu();
                                case 5 -> exit();
                            }
                        }
                    }
                }
                case 8 -> System.out.println("Info service");
                case 10 -> System.out.println("Service command editor");
                default -> System.out.println("enter a valid number");
                case 11 -> backToMainMenu();
            }
        }
        private static void printMenu() {
            System.out.println("""
                Welcome to the Nokia Menu
                Press 1-14 to select an option
                1: Phonebook
                2: Message
                3: Chat
                4: Call register
                5: Tones
                6: Settings
                7: Calls divert
                8: Games
                9: Calender
                10: Reminders
                11: Clock
                12: Profile
                13: Sim services
                14: Exit""");
        }
        private static void phoneBook() {
            System.out.println("""
                Press number 1-11 to select an option
                Phonebook
                1: Search
                2: Service Nos
                3: Add name
                4: Erase
                5: Edit
                6: Assign tone
                7: Send Birthday card
                8: Options
                9: Speed dials
                10: Voice tags
                11: Back to Main Menu
                12: Exit menu""");
            Scanner entry = new Scanner(System.in);
            int userInput = entry.nextInt();
            switch (userInput) {
                case 1: System.out.println("Search");
                    break;
                case 2: System.out.println("Service Nos.");
                    break;
                case 3: System.out.println("Add name");
                    break;
                case 4: System.out.println("Erase");
                    break;
                case 5: System.out.println("Edit");
                    break;
                case 6: System.out.println("Assign tone");
                    break;
                case 7: System.out.println("Send Birthday card");
                    break;
                case 8: System.out.println("""
                        Options
                        1: Type of view
                        2: Memory status""");
                    int in = entry.nextInt();
                    switch (in) {
                        case 1 -> System.out.println("""
                            Type of view
                            Press 11 to go back to main menu""");
                        case 2 -> System.out.println("""
                            Memory status
                            Press 11 to go back to main menu""");
                    }
                case 9: System.out.println("Speed dials");
                    break;
                case 10: System.out.println("Voice tags");
                    break;
                case 11: message();
                    break;
                case 13:exit();
                    break;
            }
            System.out.println("Press 14 to exit or 11 to main menu");
        }
        private static void backToMainMenu() {
            printMenu();
        }
}
