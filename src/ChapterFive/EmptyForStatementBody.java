package ChapterFive;

import java.util.Scanner;

public class EmptyForStatementBody {
    public static void main(String[] args) {
//        int total = 0;
//        for (int number = 2; number <= 20; total += number, System.out.println(number), number += 2) {
//            ; // empty statement

                 Scanner s = new Scanner(System.in);

                 for (int i = 1; i < 3; i++) {
                     for (int j = 1; j < 5; j++)
                         System.out.print('*');
                     System.out.println("\n#####");
                     } // end outer for loop
    }
}
