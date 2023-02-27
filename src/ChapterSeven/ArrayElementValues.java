package ChapterSeven;

public class ArrayElementValues {
    public static void main(String[] args) {
        int [][] array1 = {{1,2,3},{4,5,6}};
        int [][] array2 = {{1,2,}, {3}, {4,5,6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1);

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2);

    }

    private static void outputArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int colunm = 0; colunm < array[row].length; colunm++) {
                System.out.printf("%d  ", array[row][colunm]);
            }
            System.out.println();
        }
    }
}

//    public static void main(String[] args) {
//
//        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
//        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
//        System.out.println("Values in array1 by row are");
//        outputArray(array1); // displays array1 by row
//
//        System.out.printf("%nValues in array2 by row are%n");
//        outputArray(array2); // displays array2 by row
//    }
//
//    public static void outputArray(int[][] array) {
//        for (int row = 0; row < array.length; row++) {
//            for (int colunm = 0; colunm < array[row].length; colunm++) {
//                System.out.printf("%d ", array[row][colunm]);
//            }
//            System.out.println();
//        }
//    }
//}