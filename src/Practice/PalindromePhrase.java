package Practice;

public class PalindromePhrase {
    public static void main(String[] args) {
        String phrase = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(phrase));
    }
    public static boolean isPalindrome(String s) {
        String alphanumericString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        return alphanumericString.equals(new StringBuilder(alphanumericString).reverse().toString());
    }

}
