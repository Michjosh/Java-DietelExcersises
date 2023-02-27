package ChapterThree;
/*(Clock Class) Create a class called Clock that includes three instance variables—an hour
(type int), a minute (type int) and a second (type int). Provide a constructor that initializes the
three instance variables and assumes that the values provided are correct. Provide a set and a get
method for each instance variable. The set method should set the value of all three variables to 0 if
the value of hour is more than 23, the value of minute is more than 59, and the value of second is
more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
a test app named ClockTest that demonstrates class Clock’s capabilities.*/

public class ClockClass {

    private int hour;
    private int minute;
    private int second;

  public ClockClass(int hour, int minute, int second){
      this.hour = hour;
      this.minute = minute;
      this.second = second;
  }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
      if (hour > 23)
          this.hour = 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
      if (minute > 59)
          this.minute = 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
      if (second > 59)
          this.second = 0;
    }
    public void displayTime(){
        System.out.printf("The time is: %s:%s:%s", this.hour, this.minute, this.second);
    }
}
