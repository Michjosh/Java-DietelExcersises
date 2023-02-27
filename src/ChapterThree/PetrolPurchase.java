package ChapterThree;
/*(Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String),
the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables.
Provide a set and a get method for each instance variable. In addition,
provide a method named getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value.
Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.*/

public class PetrolPurchase {

    private String stationLocation;
    private String typePetrol;
    private int quantityPerLiter;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase (String stationLocation, String typeOfPetrol, int quantityPerLiter, double percentageDiscount, double pricePerLiter) {
        this.typePetrol = typeOfPetrol;
        this.quantityPerLiter = quantityPerLiter;
        this.percentageDiscount = percentageDiscount;
        this.pricePerLiter = pricePerLiter;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public int getQuantityPerLiter() {
        return quantityPerLiter;
    }

    public void setQuantityPerLiter(int quantityPerLiter) {
        this.quantityPerLiter = quantityPerLiter;
    }

    public String getTypePetrol() {
        return typePetrol;
    }

    public void setTypePetrol(String typePetrol) {
        this.typePetrol = typePetrol;
    }

    public double getPricePerlin() {
        return pricePerLiter;

    }

    public double getPercentageDiscount() {
        return percentageDiscount;

    }
    public double getPurchaseAmount(int quantityPerLiter){
        double netPurchase = (quantityPerLiter * pricePerLiter) - percentageDiscount;
        return netPurchase;

    }
}
