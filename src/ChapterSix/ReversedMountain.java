package ChapterSix;

public class ReversedMountain {
    public static void main(String[] args) {
        int lineNumber = 10;
        for (int row = 1; row <= lineNumber; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");
            }
            for (int column = row; column < lineNumber; column++) {
                System.out.print("* ");
            }
            for (int column = row; column <= lineNumber; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

