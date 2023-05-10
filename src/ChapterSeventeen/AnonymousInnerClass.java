package ChapterSeventeen;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousClass myAnon = new AnonymousClass();
        myAnon.makeNoise();

        AnonymousClass anonymousClass = new AnonymousClass(){
            public void makeNoise(){
                System.out.println("yyeyeyeyeye");
            }
        };
        anonymousClass.makeNoise();

        Runnable myAnonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };
        myAnonymous.run();
        Runnable anonymousClas = System.out::println;
        anonymousClas.run();


        Lamda lamda = () -> System.out.println("dancing");
        lamda.danc();
        }
}
