package ChapterFive;

/*(Triangle Printing Program) Write an application that displays the following patterns separately, 
one below the other. Use for loops to generate the patterns. 
All asterisks (*) should be printed by a single statement of the form System.out.print('*'); 
which causes the asterisks to print side by side. A statement of the form System.out.println();
can be used to move to the next line. A statement of the form System.out.print(' '); 
can be used to display a space for the last two patterns. 
There should be no other output statements in the program. 
[Hint: The last two patterns require that each line begin with an appropriate number of blank space*/

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 9; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 9; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// for (int i = 1; i <= 9; i++) {
//         for (int j = i; j <= 9; j++) {
//         System.out.print(" ");
//         }
//         for (int j = 1; j <= i; j++) {
//         System.out.print("* ");
//         }
//         System.out.println();