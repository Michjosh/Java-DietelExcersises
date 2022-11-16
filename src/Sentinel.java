import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {

    int smallest = 0; int largest = 0; int integer;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number and continue entering, or enter -99 to stop ");

        int number = input.nextInt();
        integer = input.nextInt();
        smallest = integer;

        while (integer != -99) {
            System.out.println("Enter any number and continue entering, or enter -99 to stop ");

        }
           // for(int i = 2; i < number; i++)
            {
                integer = input.nextInt();
                if(integer > largest)
                {
                    largest = integer;
                }
                if(integer < smallest)
                {
                    smallest = integer;
                }
            }
        }

 //       System.out.println("The largest number is:" + largest);
   //     System.out.println("The smallest number is : "  + smallest);
 //   }
}