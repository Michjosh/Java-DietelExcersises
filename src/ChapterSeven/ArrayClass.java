package ChapterSeven;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayClass {

        public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add(0, "yellow");

        System.out.print("Display list contents with counter-controlled loops:");

        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }
        display(items,"%nDisplay list contents with enhanced for statement:");

        items.add("green");
        items.add("yellow");
        display(items, "List with two elements:");

        items.remove("yellow");
        display(items, "Remove first instance yellow:");

        items.remove(1);
        display(items, "Remove second list element (green):");

        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "": "not ");
    }
    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);

        for (String item: items){
            System.out.printf(" %s", item);
        }
        System.out.println();
//            int[] row0 = {1, 2, 3, 4};
//            int[] row1 = {5, 6, 7, 8};
//            int[][] table = {row0, row1};
////            System.out.println(Arrays.toString(row0));
////            System.out.println(Arrays.toString(row1));
////            System.out.println(Arrays.deepToString(table));
//
//            for (int[] row : table) System.out.println(Arrays.toString(row));
        }
}
