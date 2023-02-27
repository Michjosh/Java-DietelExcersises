package ChapterFive;

public class Diamond {
        public static void main(String[] args) {
            int blank = 4;

            for (int topRow = 1; topRow < 10; topRow += 2) {
                for (int space = 0; space < blank; space++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= topRow; j++) {
                    System.out.print("*");
                }

                System.out.println();
                blank--;
            }

            blank = 1;
            for (int bottomRow = 7; bottomRow > 0; bottomRow -= 2) {
                for (int space = 0; space < blank; space++) {
                    System.out.print(" ");
                }
                for (int astericks = bottomRow; astericks > 0; astericks--) {
                    System.out.print("*");
                }
                System.out.println();
                blank++;
            }
        }
    }

