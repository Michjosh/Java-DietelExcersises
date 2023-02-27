package ChapterFive;

/*(Student Grades) A group of five students earned the following grades: Student 1, ‘A’;
student 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’.
Write an application that reads a series of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
loop as needed to input the five student grades, and then finally display the results.*/

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int total = 5;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        Scanner  input = new Scanner(System.in);


        while (gradeCounter != total){
//            System.out.println("kindly enter the student id number: ");
//             int studentNumber = input.nextInt();
            System.out.println("Kindly enter the student grade number: ");
            int gradeNumber = input.nextInt();
           ++gradeCounter;
            switch (gradeNumber / 5) {
                case 1 -> ++aCount;
                case 2 -> ++bCount;
                case 3 -> ++cCount;
                case 4 -> ++dCount;
            }
        }
        System.out.println("Grade report");
        System.out.printf("Number os Student who received each grade %n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "A: ",aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount );
    }
}
