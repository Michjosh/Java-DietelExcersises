package ChapterFive;

public class TrianglePrint {
        public static void main(String[] args) {

            int lineNumber = 10;
            for (int row = 1; row <= lineNumber; row++){
                for (int column = 1; column <= row; column++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            int n = 10;
            for (int row = 1; row <= n; row++){
                for (int column = row; column <= n; column++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            int o = 10;
            for (int i = 1; i <= o; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print("  ");
                }
                for (int j =i; j<= o; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            int p =10;
            for (int k=1; k <= p; k++){
                for(int l=k; l <= p;l++){
                    System.out.print("  ");
                }
                for (int l=1; l<=k; l++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

