package ChapterThree;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        PetrolPurchase mobile = new PetrolPurchase("Lagos", "fuel", 15,
                5.00, 150.00);

        System.out.println("Welcome to Mobile Gas Station");
        System.out.println("What location do you want to buy from: ");
        String location = entry.nextLine();
        mobile.setStationLocation(location);
        System.out.printf("%nYou are buying from %s%n", location);

        System.out.println("What kind of Petrol do you want to buy: ");
        String petrol = entry.nextLine();
        mobile.setTypePetrol(petrol);
        System.out.printf("%nYou ch oose %s%n", mobile.getTypePetrol());

        System.out.println(petrol + " is " + mobile.getPricePerlin());
        System.out.println("How much " + petrol + " do want to buy: ");
        int quantity = entry.nextInt();
        mobile.setQuantityPerLiter(quantity);
        System.out.printf("%nYou are buying %d liters.%n", mobile.getQuantityPerLiter());

        System.out.printf("%nYou have #%.2f percent discount%n", mobile.getPercentageDiscount());

        System.out.printf("%nYour price is #%.2f%n", mobile.getPurchaseAmount(quantity));
        System.out.println("You can make you payment now");
        double payment = entry.nextDouble();

        System.out.printf("You can have your %s%n", petrol);
        System.out.println("Thank you for your patronage, enjoy the rest of your day");
        }
    }

