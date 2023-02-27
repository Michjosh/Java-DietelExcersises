package ChapterSix;

public class PythagoreanTriple {
        public static void main(String[] args) {
            System.out.printf("%s%10s%10s%n",  " SideOne" , " SideTwo", " SideThree");
            for (int sideThree = 1; sideThree <= 500; sideThree++){
                for (int sideTwo = 1; sideTwo <= 500; sideTwo++){
                    for (int sideOne =1; sideOne <= 500; sideOne++){

                        if ((sideOne * sideOne) + (sideTwo * sideTwo) == sideThree * sideThree)

                            System.out.printf("%s%12s%12s%n",  sideOne , sideTwo, sideThree);

                    }

                }
            }
        }
    }
