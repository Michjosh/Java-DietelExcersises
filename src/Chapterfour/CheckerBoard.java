package Chapterfour;

public class CheckerBoard {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) {
            if (row % 2 == 0){
                System.out.print(" ");
            }
            printStar();
        }
    }
    private static void printStar(){
        for (int count = 1; count <= 8; count++){
            System.out.print("* ");
        }
        System.out.println();
    }
}