package Practice;

import java.util.Arrays;

public class SortAndSquare {
    public static void main(String[] args) {
    int [] array = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squareAndSortArrayInAscendingOrder(array)));
    }
    public static int [] squareAndSortArrayInAscendingOrder(int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        Arrays.sort(array);
        return array;
    }
}
