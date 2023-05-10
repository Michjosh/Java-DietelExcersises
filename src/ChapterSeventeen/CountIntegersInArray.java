package ChapterSeventeen;

import java.util.Arrays;

public class CountIntegersInArray {
    public static void main(String[] args) {
        String[] arr = {"Ab1396", "Q2RBS", "G381a88c"};
        System.out.println(countIntegers(arr));
//        System.out.println(countIntegersInLambda(arr));

    }

    public static int countIntegers(String[] arr) {
        int count = 0;
        for (var s : arr) {
            for (var c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countIntegersInLambda(String[] arr) {
        return Arrays.stream(arr)
                .mapToInt(s -> (int) s.chars().filter(Character::isDigit).count()).sum();
    }
}
