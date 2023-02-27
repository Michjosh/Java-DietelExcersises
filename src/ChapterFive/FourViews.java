package ChapterFive;

public class FourViews {
        public static void main(String[] args) {

            int i;
            for (i = 2; i >= 0; i--) {
                for (int j = 0; j >= 0; j--) {
                    System.out.print("1 ");
                }
                System.out.println("X 0 ");
            }
            System.out.println();
            for (i = 2; i >= 0; i--) {
                for (int j = 0; j >= 0; j--) {
                    System.out.print("X ");
                }
                System.out.println("0 1 ");
            }
            System.out.println();
            for (i = 2; i >= 0; i--) {
                for (int j = 0; j >= 0; j--) {
                    System.out.print("0 ");
                }
                System.out.println("1 X ");
            }
            System.out.println();
            for (i = 2; i >= 0; i--) {
                for (int j = 0; j >= 0; j--) {
                    System.out.print("0 ");
                }
                System.out.println("1 0 ");
            }
        }
}
