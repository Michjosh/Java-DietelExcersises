package ChapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaPractice {
    public static void main(String[] args) {
        System.out.printf("Sum of number between 1 through 10 is: %d%n",
                IntStream.rangeClosed(1, 10)
                        .map(x ->  x * 2)
                        .sum());
        System.out.printf("Sum of the triples of the even ints from 2 through 10 is: %d%n", IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 ==0)
                .map(x -> x * 3)
                .sum());
        System.out.println(IntStream.rangeClosed(1, 10)
                .filter(
                        x -> {
                            System.out.printf("%nfilter: %d%n", x);
                            return x % 2 == 0;
                        })
                .map(
                        x -> {
                            System.out.println("map: " + x);
                            return x * 3;
                        })
                .sum());

        System.out.println("Random numbers on separate lines:");
        SecureRandom randomNumbers = new SecureRandom();
        randomNumbers.ints(10, 1, 7)
                .forEach(System.out::println);

        String number =
                randomNumbers.ints(10, 1, 7)
                        .mapToObj(String::valueOf)
                        .toList()
                        .toString();
//                        .collect(Collectors.joining("/"));
        System.out.printf("%nRandom numbers on one line: %s%n", number);

        printMessage("Hello Michael");

    }
    public static void printMessage(String message) {
        final int maxLength = 100; // initialize the variable with a value

        // use the variable in a lambda expression
        Runnable printRunnable = () -> {
            if (message.length() > maxLength) {
                System.out.println(message.substring(0, maxLength) + "...");
            } else {
                System.out.println(message);
            }
        };

        // execute the lambda expression
        printRunnable.run();
    }

}
