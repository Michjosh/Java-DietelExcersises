package ChapterEight;

public class TimeMachine {
    private static int hour;
    private static int minute;
    private static int second;

    public TimeMachine(int hour, int minute, int second){
        validateHour(hour);
        this.hour = hour;
        validateMinute(minute);
        TimeMachine.minute = minute;
        validateSecond(second);
        TimeMachine.second = second;
    }

    public static void validateHour(int hour){
        boolean hourIsValid = hour < 0 || hour > 24;
        if (hourIsValid) throw new IllegalArgumentException("Hour is invalid");

    }
    public static void validateMinute(int minute) {
        boolean minuteIsValid = minute < 0 || minute > 59;
        if (minuteIsValid) throw new IllegalArgumentException("Minute is invalid");
    }
    public static void validateSecond(int second) {
        boolean secondIsValid = second < 0 || second > 59;
        if (secondIsValid) throw new IllegalArgumentException("Second is invalid");
    }

    public static int getHour() {
        return hour;
    }

    public static int getMinute() {
        return minute;
    }

    public static int getSecond() {
        return second;
    }

    public String toString() {
         return String.format("%n%s %d:%02d:%02d %s", "The time is",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}


