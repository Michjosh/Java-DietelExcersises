package ChapterFifteen;
import java.util.Arrays;

public class Alg {
    public static void main(String[] args) {
    int[] array = {4,3,2,1};

        System.out.println(Arrays.toString(lowestAndHighestIndex(array)));

    }
    public static int[] lowestAndHighestIndex(int[] arr) {
        int[] sumArray = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumArray[i] = sum;
        }

        int lowestSum = Integer.MAX_VALUE;
        int highestSum = Integer.MIN_VALUE;
        int lowestIndex = 0;
        int highestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = sumArray[arr.length - 1] - sumArray[i];
            if (currentSum < lowestSum) {
                lowestSum = currentSum;
                lowestIndex = i;
            }
            if (currentSum > highestSum) {
                highestSum = currentSum;
                highestIndex = i;
            }
        }

        return new int[]{lowestIndex, highestIndex};
    }

}
