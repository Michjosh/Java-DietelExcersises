package ChapterEleven;

public class CustomException {
    public static void main(String[] args) throws AgelessThanZeroException {
        validateAge(-1);
    }

    private static void validateAge(int age) throws AgelessThanZeroException {
       if (age < 0){
         throw new AgelessThanZeroException("Age cannot be negative");
       }
    }
}

