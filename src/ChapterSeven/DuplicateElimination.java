package ChapterSeven;

/*Duplicate Elimination Use a one-dimensional array to solve the following problem:
Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save
each number that was read in an array that was initialized to a value of -1 for all elements. Assume
a value of -1 indicates an array element is empty. You are then to process the array, and remove
duplicate elements from the array containing the numbers you input. Display the contents of the
array to demonstrate that the duplicate input values were actually removed. [Note: do not display
the array elements where the value is -1.]*/

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        int[] myArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        Scanner input = new Scanner(System.in);
        System.out.println("Initial value of My Array: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Hey, Kindly enter 10 numbers from 10 to 100: ");
            myArray[i] = input.nextInt();
        }
        System.out.println("\nValue of My Array entered: \n"+ Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("Values of My Array sorted: \n" + Arrays.toString(myArray));
        int length = myArray.length;
        int uniqueNumber= removeDuplicate(myArray, length);
        System.out.println("My Array with unique numbers: ");

        for (int i = 0; i < uniqueNumber; i++) {
            System.out.print(myArray[i] +", ");
        }

    }
    public static int removeDuplicate (int[] array, int length) {
        if (length == 0 || length == 1){
            return length;
        }
        int[] newArray = new int[length];
        int uniqueNumber = 0;
        for (int i = 0; i < length-1; i++) {
            if (array[i] != array[i+1]){
                newArray[uniqueNumber++] = array[i];
            }
        }
        newArray[uniqueNumber++] = array[length-1];
//        for (int i = 0; i < uniqueNumber; i++)
        if (uniqueNumber >= 0) System.arraycopy(newArray, 0, array, 0, uniqueNumber);
        return uniqueNumber;
    }
}
