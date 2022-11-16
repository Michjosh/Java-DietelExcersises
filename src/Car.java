public class Car {
    private String name;
    private String colour;
    private String model;

    private int year;

    public Car(String name, String colour, String model, int year) {
        this.name = name;
        this.colour = colour;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() { this.year = year;
        return 2013;
    }

    public void setYear(int year) {this.year = year; }

    public static void main(String[] args) {
        Car car1 = new Car("Honda Accord,", "Gray", "EOD", 2013);
        Car car2 = new Car("Honda Accord", "Black", "Evil spirit", 2023);

        car1.setColour("White");

        System.out.println("Car1's name is " + car1.getName());
        System.out.println("Car1's colour is " + car1.getColour());
        System.out.println("Car1's model is " + car1.getModel());
        System.out.println("Car1's year is " + car1.getYear());

    }

       // Scanner input = new Scanner(System.in);
      //  System.out.println("What's is car1's colour ");

      ////  String this.colour= input.nextline();}

}


