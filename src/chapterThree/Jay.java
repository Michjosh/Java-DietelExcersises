package chapterThree;

import java.util.Scanner;

public class Jay{
    public static void main(String[] args)
    {
        // I'm breaking these up to be a little more readable
        int smallest;
        int largest;
        // let's rename this something... not integer
        int userInt;

        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);

        // Let's make the prompt a little more descriptive
        System.out.println("Enter some integers: ");
        System.out.println("Enter -99 when finished.");
        System.out.println();

        // Let's get rid of all these other variables and just get userInt
        userInt = input.nextInt();

        // To avoid doing anything else if we get -99 for the first number
        //  we'll test and exit accordingly.
        if (userInt == -99)
        {
            return;
        }

        smallest = userInt;
        largest = userInt;

        // Assuming we want to exit if the first number they enter is -99 we'll
        //  test before doing anything
        while (userInt != -99)
        {
            // Note: this is not the cleanest, because we'll be wasting an
            //  iteration on data we've already stored in smallest & largest
            //  but it shouldn't hurt and I'm trying to minimize changes to
            //  your original structure.
            if(userInt > largest)
            {
                largest = userInt;
            }
            if(userInt < smallest)
            {
                smallest = userInt;
            }
            // Now that we've evaluated the first number entered we'll get
            //  the next number before we loop again so we'll be ready to see
            //  if we've hit an exit condition
            userInt = input.nextInt();
        }

        // This should be all you need to do, and after the loop is finished
        //  you can report.
        System.out.println("The largest number is:" + largest);
        System.out.println("The smallest number is : "  + smallest);
    }
}

