package Chapterfour;//(ChapterThree.Car Class) Create a class called ChapterThree.Car that includes three instance variables—a model (type
      //  String), a year (type String), and a price (double).


public class ModifiedCar {

    private String model;
    private String year;
    private double price;

   // Provide a constructor that initializes the three
   // instance variables.

    public ModifiedCar(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Provide a set and a get method for each instance variable.

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getYear() {return year;}

    public void setYear(String year) {this.year = year;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;
        //   If the price is not positive, do not set its value.
        if (price>0) this.price = price;
    }
//Then apply a 5% discount on the// price of the first car and a 7% discount on the price of the second.
    public void applyDiscount(int discountRate) {
        double discount = (discountRate / 100) * price;
        price = price - discount;
    }

}
