package Practice;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middleIndex = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, middleIndex);
        int[] leftSorted = mergeSort(leftArr);
        int[] rightArr = Arrays.copyOfRange(arr, middleIndex, arr.length);
        int[] rightSorted = mergeSort(rightArr);
        int[] sortedArr = new int[arr.length];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < arr.length; i++) {
    if (leftIndex < leftSorted.length && (rightIndex >= rightSorted.length
                    || leftSorted[leftIndex] < rightSorted[rightIndex])) {
         sortedArr[i] = leftSorted[leftIndex];
                leftIndex++;
            } else {
               sortedArr[i] = rightSorted[rightIndex];
            }
        }
        return sortedArr;
    }
}
