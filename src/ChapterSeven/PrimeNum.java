package ChapterSeven;

public class PrimeNum {
    public static void main(String[] args) {

//
        for (int number = 2; number <= 100; number++){
            int counter = 0;
            for (int factor =2; factor <= number; number++){
                if (number % factor ==0){
                    System.out.println(number + " is a prime number");
                    break;
                }
            }
            counter++;
            System.out.println(counter+ " is the number of prime numbers");
        }
    }
}

