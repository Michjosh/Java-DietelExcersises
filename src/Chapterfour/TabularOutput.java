package Chapterfour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%10s","N","N2","N3","N4");
        for (int row = 1; row <= 5; row++) {
            for (int colunm = 1; colunm < 2; colunm++) {
                System.out.printf("%n%d%10d%10d%10d", row , colunm  , row , colunm );

            }
        }

    }
}
