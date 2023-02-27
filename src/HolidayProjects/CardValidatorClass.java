package HolidayProjects;

import java.util.Scanner;

public class CardValidatorClass {
    public static int[] cardNumber;

    public static void displayCardResult(){
        getInput();
        System.out.println("****************************************");
        getCardType(cardNumber);
        getCardNumber(cardNumber);
        getCardLength(cardNumber);
        getValidity(cardNumber);
        System.out.println("****************************************");
    }
    public static void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify: ");
        String cardDigits = input.nextLine();
        cardNumber = new int[cardDigits.length()];
        for (int i = 0; i < cardDigits.length(); i++) {
            cardNumber[i] = Integer.parseInt(cardDigits.substring(i, i + 1));
        }
    }
    public static void getCardType(int[] cardNumber){
        if (cardNumber[0] == 4){
            System.out.println("**Credit Card Type: Vasa Card");
        } else if (cardNumber[0] == 5) {
            System.out.println("**Credit Card Type: MasterCard");
        } else if (cardNumber[0] == 37) {
            System.out.println("**Credit Card Type: American Express Cards");
        } else if (cardNumber[0] == 6) {
            System.out.println("**Credit Card Type: Discover cards");
        }
    }
    public static void getCardNumber(int[] cardNumber){
        System.out.print("**Credit Card Number: ");
        for (int j : cardNumber) {
            System.out.print(j);
        }
        System.out.println();
    }
    public static void getCardLength(int[] cardNumber){
        int cardLength = cardNumber.length;
        System.out.println("**Credit Card Digit length: " + cardLength);
    }
    public static void getValidity(int[] cardNumber) {
        for (int i = cardNumber.length - 2; i >= 0; i = i - 2) {
            int j = cardNumber[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            cardNumber[i] = j;
        }
        int sum = 0;
        for (int j : cardNumber) {
            sum += j;
        }
        if (sum % 10 == 0)
            System.out.println("**Credit Card Validity Status: Valid");
        else
            System.out.println("**Credit Card Validity Status: Invalid");
    }
}
