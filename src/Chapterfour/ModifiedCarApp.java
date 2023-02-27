package Chapterfour;

public class ModifiedCarApp {
   //Write a test application named CarApplication that demonstrates class ChapterThree.Car’s capabilities.
    // Create two ChapterThree.Car objects and display each object’s price

        public static void main(String[] args) {
            ModifiedCar bmw = new ModifiedCar("A5", "2021", 3_000_000.00);
            ModifiedCar toyota = new ModifiedCar("Camry", "2021", 5_000_000.00);

            //Display each ChapterThree.Car’s price again.
            System.out.println("BMW Price is " + bmw.getPrice());
            System.out.println("Toyota Price is " + toyota.getPrice());

        }
    }

