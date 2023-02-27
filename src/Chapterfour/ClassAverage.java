package Chapterfour;


import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int sum = 0;
        int counter = 1;

        while (counter <= 10) {
            if (counter == 1){
                System.out.println("Enter fist average");
                int firstGrade = entry.nextInt();
                    if (firstGrade >= 100)
                        sum += firstGrade;
                    counter ++;}
                else {
                System.out.println("Enter a valid number");}

            System.out.println("Enter Second average");
            int secondGrade = entry.nextInt();
            sum += secondGrade;
            counter ++;
            System.out.println("Enter third average");
            int thirdGrade = entry.nextInt();
            sum += thirdGrade;
            counter ++;
            System.out.println("Enter fourth average");
            int fourthGrade = entry.nextInt();
            sum += fourthGrade;
            counter ++;
            System.out.println("Enter fifth average");
            int fifthGrade = entry.nextInt();
            sum += fifthGrade;
            counter ++;
            System.out.println("Enter sixth average");
            int sixthGrade = entry.nextInt();
            sum += sixthGrade;
            counter ++;
            System.out.println("Enter seventh average");
            int seventhGrade = entry.nextInt();
            sum += seventhGrade;
            counter ++;
            System.out.println("Enter eight average");
            int eightGrade = entry.nextInt();
            sum += eightGrade;
            counter ++;
            System.out.println("Enter ninth average");
            int ninthGrade = entry.nextInt();
            sum += ninthGrade;
            counter ++;
            System.out.println("Enter tenth average");
            int tenthGrade = entry.nextInt();
            sum += tenthGrade;

        counter ++;

        int average = sum / 10;
        System.out.printf("sum of 10 grades is %d%n", sum);
        System.out.printf("Class average is %d%n", average);

        }
    }
}

