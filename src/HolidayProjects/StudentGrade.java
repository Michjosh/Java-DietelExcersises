package HolidayProjects;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static int[][] studentNum;
    public static int numOfStudent;
//
//    public static void displaySubjectSummary() {
//
//        System.out.println("SUBJECT SUMMARY");
//        System.out.println("Subject 1");
//        for (int student = 0; student < studentNum.length; student++) {
//            System.out.printf("\nStudent%2d", student + 1);
//
//            for (int subject : studentNum[student]) {
//                System.out.printf("%8d", subject);
//                System.out.println("Highest scoring student is: ");
//            }
//        }
//    }
    public static int getTotal(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static double getAverage(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return (double) total / array.length;
    }

    public static void processGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter the number of students");
        numOfStudent = input.nextInt();
        System.out.println("Kindly enter the number of Subject");
        int numOfSubject = input.nextInt();
        int[][] studentNum = new int[numOfStudent][numOfSubject];
        int score;
        for (int i = 0; i < studentNum.length; i++) {
            for (int j = 0; j < studentNum[i].length; j++) {
                System.out.println("Entering score for Student " + (i + 1));
                System.out.println("Enter score for Subject " + (j + 1));

                    try {
                        score = input.nextInt();
                        if (score >= 0 & score <= 100)
                            studentNum[i][j] = score;
                             else
                            throw new IllegalArgumentException("Enter a valid score from 0 to 100");
                        }
                    catch(IllegalArgumentException ex){
                        System.err.println(ex.getMessage());
                    }
                }
            }
            System.out.println();
        System.out.println("===================================================================================");
        System.out.print("STUDENT  ");
        for (int subject = 0; subject < studentNum[0].length; subject++) {
            System.out.printf("    SUB%d ", subject + 1);
        }
        System.out.print("  Total");
        System.out.print("  Average");
        System.out.println("  Position");
        System.out.print("===================================================================================");

        for (int student = 0; student < studentNum.length; student++) {
            System.out.printf("\nStudent%2d", student + 1);

            for (int subject : studentNum[student]) {
                System.out.printf("%8d", subject);
            }
            System.out.printf("%9d", getTotal(studentNum[student]));
            System.out.printf("%9.2f", getAverage(studentNum[student]));
        }
    }
}

//    public static Object getPosition(){
//        int[] position;
//        for (int i = 0; i < studentNum.length; i++) {
//         position = studentNum[i];
//
//        Arrays.sort(position);
//            for (int j = 0; j < position.length; j++) {
//                System.out.println(" "+1);
//            }
//        }
//        return null;
//    }