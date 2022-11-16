package chapterThree;
import java.util.Scanner;
public class Enter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();

        if (number %2 == 0)
            System.out.printf("%s is an even number", number);
        else System.out.printf("%s is an odd number", number);


    }

}
