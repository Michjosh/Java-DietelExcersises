package Practice;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr)));
    }
    public static int[] shuffle ( int[] nums){
        int n = nums.length / 2;
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }
        return result;
    }
}