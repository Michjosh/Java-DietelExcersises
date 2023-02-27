package Chapterfour;

import java.util.Scanner;

public class SwitchCase {

        public static void main(String[] args) {

            System.out.println("""
                1. 2000
                2. 5000
                3. 10000
                4. 15000
                5. 20000
                6. other amount
                """);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter an Option:");
            int input = scanner.nextInt();
            switch (input){
                case 6:
                    System.out.println(" Enter amount");
                    String amount = scanner.nextLine();
                    handleOtherAmounts(amount);
                case 1:
                    System.out.println("take your 2k");
                    break;
                case 2:
                    System.out.println("take your 5k");
                    break;
                case 3:
                    System.out.println("take your 15k");
                    break;
                case 4:
                    System.out.println("take your 20k");
                    break;
                default:
                    System.out.println("Money don finish");
                    break;
            }
        }

        private static void handleOtherAmounts(String amount) {
            System.out.println("take your"+amount+"K");
        }
}
