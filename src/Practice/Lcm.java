package Practice;

import java.util.Arrays;

public class Lcm {
    public static void main(String[] args) {
        int num = -26;
        System.out.println(Arrays.toString(getLcmDivisors(num)));

    }
    public static int[] getLcmDivisors(int n) {
        int count = 0;
        for (int i = 2; i <= Math.abs(n)/2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] divisors = new int[count];
        int index = 0;

        for (int i = 2; i <= Math.abs(n)/2; i++) {
            if (n % i == 0) {
                divisors[index++] = i;
            }
        }
        return divisors;
    }

}
