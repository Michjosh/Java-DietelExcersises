package ChapterEleven;

public class AgelessThanZeroException extends Exception {

    public AgelessThanZeroException(String message){
        super(message);
    }
    public AgelessThanZeroException(){

    }
    public AgelessThanZeroException(Throwable cause){
        super(cause);
    }

    public AgelessThanZeroException(String message, Throwable cause){
        super(message, cause);
    }
}
