import java.util.Scanner;

//public class Function {
//
//    public static void main(String[] args) {
//        Scanner intake = new Scanner(System.in);
//        System.out.println("whats your age");
//        int age = intake.nextInt();
//
//        switch (age) {
//            case 20 -> System.out.println("not you");
//            case 40-> System.out.println("you coming up");
//            default -> {System.out.println(age);
//            }
//        }
//    }
//
//}

public class Function {
    public static void main(String[] args) {
 Scanner input = new Scanner( System.in);

 System.out.println("enter a number");
 int number = input.nextInt();

 for (int counter = 1; number < 12; number++) {
            //initial condition
            //loop continuation condition
            //post condition
     //number=number*number;
            System.out.printf("%d times %d is %d%n", number, counter, (counter*number));
        }
    }
}

