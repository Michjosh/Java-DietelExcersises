package Practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatter {
    public static void main(String[] args) throws WrongInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date you want to format: ");
        String dateToFormat = scanner.nextLine();
//        System.out.println(convertDateFormat(dateToFormat));
//        System.out.println(convertDate(dateToFormat));
        System.out.println(convertDate2(dateToFormat));
    }
    public static String convertDateFormat(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println(date);
        String month = date.getMonth().toString();
        String formattedMonth = month.charAt(0) + month.substring(1, 3).toLowerCase() + month.substring(3).toLowerCase();
        return date.getDayOfWeek()+ ", "+ date.getDayOfMonth() + " " + formattedMonth + ", " + date.getYear();
    }

    public static String convertDate(String date){
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyy")));
    }

    public static  String convertDate2(String date) throws WrongInputException {
        if (date.contains("-")) {
            String[] splitDate = date.split("-");
            LocalDate localDate = LocalDate.of(Integer.parseInt(splitDate[2]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[0]));
            return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);
        } else if (date.contains("/")) {
            String[] splitDate = date.split("/");
            LocalDate localDate = LocalDate.of(Integer.parseInt(splitDate[2]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[0]));
            return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);
        } else throw new WrongInputException("Enter a date using this format dd/MM/yyyy or dd-MM-yyyy");
    }
}
