package ChapterSeven;

/*(Dice Rolling) Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
each possible sum appears. Display the results in tabular format.*/

import java.security.SecureRandom;

public class RollingDice {
    public static void main(String[] args) {

        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        int frequency7 = 0;
        int frequency8 = 0;
        int frequency9 = 0;
        int frequency10 = 0;
        int frequency11 = 0;
        int frequency12 = 0;


        for (int i = 0; i < 36_000_000; i++) {
        int frequency = rollDice();

            switch (frequency) {
                case 1 -> ++frequency2;
                case 2 -> ++frequency3;
                case 3 -> ++frequency4;
                case 4 -> ++frequency5;
                case 5 -> ++frequency6;
                case 6 -> ++frequency7;
                case 7 -> ++frequency8;
                case 8 -> ++frequency9;
                case 9 -> ++frequency10;
                case 10 -> ++frequency11;
                case 11 -> ++frequency12;
            }
        }
        System.out.println("Sum\tFrequency Times"); // output headers
        System.out.printf("2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n7\t%d%n8\t%d%n9\t%d%n10\t%d%n11\t%d%n12",
                frequency2, frequency3, frequency4, frequency5, frequency6,
                frequency7, frequency8, frequency9, frequency10, frequency11, frequency12);
    }
        private static int rollDice() {
            SecureRandom random = new SecureRandom();
            int roll1 = 1 + random.nextInt(6);
            int roll2 = 1 + random.nextInt(6);
            int sum = roll1 + roll2;
            return sum;
    }
//    private static int getFrequency(int[] array){
//        for(int i = 0; i < number.length ; i++) {
//            if (number[i] !=0) {
//                if (number[i] == 1)
//                    System.out.println(i + " occurs " + number[i] + " time");
//                else
//                    System.out.println(i + " occurs " + number[i] + " times ");
//
//            }
}
