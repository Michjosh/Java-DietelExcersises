package ChapterThree;
/*(Car Class) Create a class called Car that includes three instance variables—a model
(typeString), a year (type String), and a price (double).
Provide a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable. If the price is not positive,
do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities.
Create two Car objects and display each object’s price. Then apply a 5% discount on the
price of the first car and a 7% discount on the price of the second. Display each Car’s price again.*/

public class CarClass {
    private String model;
    private String year;
    private double price;

    public CarClass(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) this.price = price;
    }

    public double sevenDiscount(double discount) {
        discount = (price * 7) / 100;
        return discount;
    }
    public double fiveDiscount(double discount) {
        discount = (price * 5) / 100;
        return discount;
    }
}
