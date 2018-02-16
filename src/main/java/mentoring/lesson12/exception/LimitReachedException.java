package mentoring.lesson12.exception;

public class LimitReachedException extends Exception{

    public LimitReachedException(){
        super();
    }

    public LimitReachedException(String text){
        super(text);
    }

    public LimitReachedException(String text, Throwable cause){
        super(text, cause);
    }

    public LimitReachedException(Throwable cause){
        super (cause);
    }
}
