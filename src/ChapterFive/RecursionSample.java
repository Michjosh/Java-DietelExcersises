package ChapterFive;

public class RecursionSample {
    public static int patternSpace = 4;
    public static void main(String[] args) {
        printTriangle(5);

    }
    private static void printTriangle(int number){
        if (number<1) {
            return;

        }
        number=number-1;
        printTriangle(number);
        for (int index = number; index < patternSpace; index++) {
            System.out.print(" ");
        }
        for (int index =0; index < number; index++){
            System.out.print("*");
        }
        System.out.println();
    }
}
