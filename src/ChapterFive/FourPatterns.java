package ChapterFive;

public class FourPatterns {
        public static void main(String[] args) {
            int m = 6;

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 6; i >= 1; i--) {
                for (int j = i; j >= 1 ; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();
            int o = 6;
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j <= o; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();
            int p = 6;
            for (int i = 1; i <= p; i++) {
                for (int j = i; j <= p; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
}
