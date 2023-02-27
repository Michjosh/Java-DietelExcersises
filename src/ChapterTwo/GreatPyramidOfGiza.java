package ChapterTwo;
/*(Statistics for the Great Pyramid of Giza) The Great Pyramid of Giza is considered an
 engineering marvel of its time. Use the web to get statistics related to the Great Pyramid of Giza, and
 find the estimated number of stones used to build it, the average weight of each stone,
 and the number of years it took to build. Create an application that calculates an estimate of how much,
 by weight, of the pyramid was built each year, each hour, and each minute as it was being built.
 The application should input the following information:
        a) Estimated number of stones used.
        b) Average weight of each stone.
        c) Number of years taken to build the pyramid (assuming a year comprises 365 days)*/

import java.util.Scanner;

public class GreatPyramidOfGiza {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.println("Kindly enter the number of stones used to build the pyramid of Giza");
        int numberOfStones = entry.nextInt();

        System.out.println("Kindly enter the average weight of the each stone");
        double weightOfStones = entry.nextDouble();

        System.out.println("Kindly enter the number of years taken to build the pyramid");
        int years = entry.nextInt();

        int year = years / 365;
        int hour = years / 8760;
        int minutes = years / 525600;

        double pyramidByYear = year / (weightOfStones * numberOfStones);
        double pyramidByHour = hour / (weightOfStones * numberOfStones);
        double pyramidByMinutes = minutes / (weightOfStones * numberOfStones);

        System.out.println("By weight,the pyramid amount of the pyramid that was built each year is " + pyramidByYear+ " each hour: "
                +pyramidByHour+"  and each minute is " +pyramidByMinutes);




    }
}
