package ChapterFive;

/*(Bar-Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks.
For example, if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.*/

public class BarChat {
    public static void main(String[] args) {
        String star = " * ";
        for (int i = 1; i <= 30; i++) {
            System.out.print(i);
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
