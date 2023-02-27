package ChapterThree;

public class CarApplication {
    public static void main(String[] args) {
        CarClass one = new CarClass("Benz", "2020", 200_000.00);
        CarClass two = new CarClass("Toyota", "2022", 100_000.00);

        System.out.printf("Price for %s is #%.2f%n", one.getModel(), one.getPrice());
        System.out.printf("Price for %s is #%.2f%n", two.getModel(), two.getPrice());

        System.out.printf("Five percent discount on %s is #%.2f%n", one.getModel(), one.fiveDiscount(one.getPrice()));
        System.out.printf("Seven percent discount on %s is #%.2f",two.getModel(), two.sevenDiscount(two.getPrice()));
    }
}
