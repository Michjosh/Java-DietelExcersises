package Chapter14;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class StingBuilder {
    public static void main(String[] args) {
//        List<String> tree = Arrays.asList("Oak", "pine", "fir", "birch", "elm", "yew");
//        System.out.println(listToString(tree));

//        int [] numbers = {10,12,3,4};
//        for (int i = numbers.length-1; i >=0 ; i--) {
//            System.out.print(numbers[i]+ ", ");
//        }
//    }
//
//        int[] numberArray = {10, 12, 3, 4};
//        int[] reversedNumbers = new int[numberArray.length];
//        for (int m = numberArray.length - 1, j = 0; m >= 0; m--, j++) {
//            reversedNumbers[j] = numberArray[m];
//        }
//        System.out.println(Arrays.toString(reversedNumbers));

        Scanner input = new Scanner(System.in);
        System.out.println("enter a date to format");
        String date = input.nextLine();
//        System.out.println(email.matches("[a-z]+@[a-z]+\\.[a-z]{3,}"));
//
//    private static String listToString(List<String> list){
//        StringBuilder sb = new StringBuilder(32);
//
//        for (String el: list) {
//            sb.append(el).append(" ");
//        }
//        return sb.toString();
//    }

//        System.out.println(convertDateFormat(date));
//        System.out.println(formatDate(date));
    }

    public static String convertDateFormat(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        String month = date.getMonth().toString();
        String formattedMonth = month.charAt(0) + month.substring(1, 3).toLowerCase() + month.substring(3).toLowerCase();
        return date.getDayOfMonth() + " " + formattedMonth + "," + date.getYear();
    }

//    public static String formatDate(String dateStr) {
//        String[] parts = dateStr.split("/");
//        String day = parts[0];
//        String month = parts[1];
//        String year = parts[2];
//
////        String monthStr = switch (month.substring(0,2)) {
////            case '1' -> "Jan";
////            case '2' -> "Feb";
////            case '3' -> "Mar";
////            case '4' -> "Apr";
////            case '5' -> "May";
////            case '6' -> "Jun";
////            case '7' -> "Jul";
////            case '8' -> "Aug";
////            case '9' -> "Sep";
////            case '10' -> "Oct";
////            case '11' -> "Nov";
////            case '12' -> "Dec";
////            default -> "";
////        };
////        return day+month+","+year;
////    }
//    }

}