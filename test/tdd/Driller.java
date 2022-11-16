package tdd;

public class Driller {
    public int quantity(int quantity) {
        int amountForEachCopy = 0;
        if (quantity > 0 && quantity <= 4) {amountForEachCopy = quantity * 2000;}

        if (quantity >= 5 && quantity <= 9) {amountForEachCopy = quantity * 1800;}

        if (quantity >= 10 && quantity <= 29) {amountForEachCopy = quantity * 1600;}

        if (quantity >= 30 && quantity <= 49) {amountForEachCopy = quantity * 1500;}

        if (quantity >= 50 && quantity <= 99) {amountForEachCopy = quantity * 1300;}

        if (quantity >= 100 && quantity <= 199) {amountForEachCopy = quantity * 1200;}

        if (quantity >= 200 && quantity <= 499) {amountForEachCopy = quantity * 1100;}

        if (quantity > 500) {amountForEachCopy = 1000;}

        return amountForEachCopy;
    }
}