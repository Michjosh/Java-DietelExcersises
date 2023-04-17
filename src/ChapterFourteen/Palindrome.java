package ChapterFourteen;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a some numbers or words to check if its palindrome");
        String input = entry.nextLine();
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String x) {
        char[] charArray = x.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
