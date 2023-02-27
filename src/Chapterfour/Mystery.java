package Chapterfour;
    // Exercise 4.25: Mystery2.java
 public class Mystery {
//public static void main(String[] args) {
//int count = 1;
//while (count <= 20) {
//System.out.println(count % 3 == 1 ? "########" : "++++++++");
//++count;
//} // end while
//} // end main
//} // end class Mystery

        public static void main(String[] args) {
            int row = 5;

            while (row >= 1) {
                int colunm = 5;

                while (colunm >= 1){
                    System.out.println(row % 2 == 0 ? "X" : "O");
                    ++colunm;
                }
                --row;
                System.out.println();
            }

        }

    }

