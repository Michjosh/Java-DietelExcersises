package ChapterThree;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        ClockClass myClock = new ClockClass(23, 59, 59);

        System.out.println("Hi, enter the hour in 24hrs format ");
        int hour = entry.nextInt();
        myClock.setHour(hour);

        System.out.println("Enter the minutes ");
        int minute = entry.nextInt();
        myClock.setMinute(minute);

        System.out.println("Enter the seconds ");
        int second = entry.nextInt();
        myClock.setSecond(second);

        myClock.displayTime();
    }
}
