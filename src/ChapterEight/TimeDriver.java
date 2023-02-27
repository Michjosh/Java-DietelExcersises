package ChapterEight;

import java.util.Scanner;

public class TimeDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey Kindly enter the hour");
        int hour = input.nextInt();
        System.out.println("Hey Kindly enter the minute");
        int minute = input.nextInt();
        System.out.println("Hey Kindly enter the second");
        int second = input.nextInt();

      TimeMachine time = new TimeMachine(hour, minute, second);

        System.out.println(time);
    }
}
