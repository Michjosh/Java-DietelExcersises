package ChapterSix;

public class TriangleShape {
        public static void main(String[] args) {

            for (int i = 1; i <= 10; i--) {
                for (int j = i; j >= 0; j--)
                    for (int k = 1; k >=0; k--) {
                        System.out.print( i + " ");
                    }
                System.out.println();
            }
        }
    }
