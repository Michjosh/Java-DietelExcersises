package HolidayProjects;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutServer {
    public static double discount;
    public static String cashierName;
    public static String customerName;
    public static double amountPaid;
    public static double subtotal;

    public static Scanner input = new Scanner(System.in);

     public static ArrayList<String> items = new ArrayList<>();
     public static ArrayList<Integer> quantity = new ArrayList<>();
     public static ArrayList<Double> amount = new ArrayList<>();

     public static ArrayList<Double> total = new ArrayList<>();
     public static LocalDateTime dateTime = LocalDateTime.now();


    public static void checkoutProcessor() {
        System.out.println("What is the customer's name: ");
        customerName = input.nextLine();
        String addMore = "Yes";

        System.out.println("What did the customer buy: ");
        String product = input.next();
        items.add(product);
        System.out.println("How many pieces: ");
        int noOfProduct = input.nextInt();
        quantity.add(noOfProduct);
        System.out.println("How much per unit: ");
        double costOfProduct = input.nextInt();
        amount.add(costOfProduct);
        total.add(noOfProduct * costOfProduct);
        for (Double aDouble : total) {
            subtotal += aDouble;
        }
        System.out.println("Add more item: Yes or No ");
        addMore = input.next();

        while (addMore.trim().equalsIgnoreCase("Yes".trim()) != addMore.trim().equalsIgnoreCase("No".trim())) {
            System.out.println("What did the customer buy: ");
            product = input.next();
            items.add(product);
            System.out.println("How many pieces: ");
            noOfProduct = input.nextInt();
            quantity.add(noOfProduct);
            System.out.println("How much per unit: ");
            costOfProduct = input.nextInt();
            amount.add(costOfProduct);
            total.add(noOfProduct * costOfProduct);
            for (Double aDouble : total) {
                subtotal += aDouble;
            }
            System.out.println("Add more item: Yes or No ");
            addMore = input.next();
        }

                System.out.println("Whats is your name?: ");
                cashierName = input.next();
                System.out.println("How much discount for the customer: ");
                discount = input.nextDouble();

                display(items, quantity, amount);
            }
    public static double getSubtotal(ArrayList<Double> total){
        subtotal = 0;
        for (int i = 0; i < total.size(); i++) {
            subtotal += total.get(i);
        }
        return subtotal;
    }
    public static double getDiscount(double discount){
        double discountPrice = 0;
        for (int i = 0; i < total.size(); i++) {
            discountPrice += discount / 100 * total.get(i);
        }
        return discountPrice;
    }
    public static double getVat(double subtotal ){
        double vat = 0;
            vat = (subtotal * 100) + 17.50 / 100;
        return vat;
    }
    public static void display(ArrayList<String> items, ArrayList<Integer> quantity, ArrayList<Double> amount){
        System.out.println();
        System.out.println();
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 03293828343");
        System.out.println("DATE/TIME: " + dateTime);
        System.out.println("CASHIER: " + cashierName);
        System.out.println("CUSTOMER NAME: " + customerName);
        System.out.println("==========================================================================");
        System.out.printf("%15s%15s%15s%20s%n", "ITEM", "QUANTITY", "PRICE", "TOTAL(NGN)");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%15s", items.get(i));
            System.out.printf("%15d", quantity.get(i));
            System.out.printf("%15.2f", amount.get(i));
            System.out.printf("%15.2f", total.get(i));
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%30s%15.2f%n", "Sub Total:", getSubtotal(total));
        System.out.printf("%30s%15.2f%n", "Discount:", getDiscount(discount));
        System.out.printf("%30s%15.2f%n%n", "VAT @ 17.50%:", (17.50/100) * ((getSubtotal(total) - getDiscount(discount))));
        System.out.println("==========================================================================");
        System.out.printf("%30s%15.2f%n", "Bill Total:", getSubtotal(total) + ((17.50/100) * getSubtotal(total) - getDiscount(discount)));
        System.out.println("==========================================================================");
        System.out.printf("%30s%2.2f%n", "THIS IS NOT A RECEIPT KINDLY PAY: ", getSubtotal(total) + ((17.50/100) * getSubtotal(total) - getDiscount(discount)));
        System.out.println();
        System.out.println("How much did the customer pay: ");
        amountPaid = input.nextDouble();
        if (amountPaid == getSubtotal(total) - getDiscount(discount)) {

            System.out.println();
            System.out.println("SEMICOLON STORES");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
            System.out.println("TEL: 03293828343");
            System.out.println("DATE/TIME: " + dateTime);
            System.out.println("CASHIER: " + cashierName);
            System.out.println("CUSTOMER NAME: " + customerName);
            System.out.println("==========================================================================");
            System.out.printf("%15s%15s%15s%20s%n", "ITEM", "QUANTITY", "PRICE", "TOTAL(NGN)");
            System.out.println("--------------------------------------------------------------------------");
            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%15s", items.get(i));
                System.out.printf("%15d", quantity.get(i));
                System.out.printf("%15.2f", amount.get(i));
                System.out.printf("%15.2f", total.get(i));
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("%30s%15.2f%n", "Sub Total:", getSubtotal(total));
            System.out.printf("%30s%15.2f%n", "Discount:", getDiscount(discount));
            System.out.printf("%30s%15.2f%n%n", "VAT @ 17.50%:", (17.50/100) * ((getSubtotal(total) - getDiscount(discount))));
            System.out.println("==========================================================================");
            System.out.printf("%30s%15.2f%n", "Bill Total:", getSubtotal(total) + ((17.50/100) * getSubtotal(total) - getDiscount(discount)));
            System.out.printf("%30s%15.2f%n", "Amount Paid:", amountPaid);
            System.out.println("==========================================================================");
            System.out.printf("%50s", "THANKS FOR YOUR PATRONAGE");
        }
        else if (amountPaid > getSubtotal(total) - getDiscount(discount)) {

            System.out.println();
            System.out.println("SEMICOLON STORES");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
            System.out.println("TEL: 03293828343");
            System.out.println("DATE/TIME: "+ dateTime);
            System.out.println("CASHIER: "+ cashierName);
            System.out.println("CUSTOMER NAME: " + customerName);
            System.out.println("==========================================================================");
            System.out.printf("%15s%15s%15s%20s%n", "ITEM", "QUANTITY", "PRICE", "TOTAL(NGN)");
            System.out.println("--------------------------------------------------------------------------");
            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%15s", items.get(i));
                System.out.printf("%15d", quantity.get(i));
                System.out.printf("%15.2f", amount.get(i));
                System.out.printf("%15.2f", total.get(i));
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("%30s%15.2f%n", "Sub Total:", getSubtotal(total));
            System.out.printf("%30s%15.2f%n", "Discount:", getDiscount(discount));
            System.out.printf("%30s%15.2f%n%n", "VAT @ 17.50%:", (17.50/100) * (getSubtotal(total) - getDiscount(discount)));
            System.out.println("==========================================================================");
            System.out.printf("%30s%15.2f%n", "Bill Total:", getSubtotal(total) + ((17.50/100) * getSubtotal(total) - getDiscount(discount)));
            System.out.printf("%30s%15.2f%n", "Amount Paid:", amountPaid);
            System.out.printf("%30s%15.2f%n", "Balance:", amountPaid - (getSubtotal(total) + ((17.50/100) * getSubtotal(total) - getDiscount(discount))));
            System.out.println("==========================================================================");
            System.out.printf("%50s", "THANKS FOR YOUR PATRONAGE");

        }
    }
}
