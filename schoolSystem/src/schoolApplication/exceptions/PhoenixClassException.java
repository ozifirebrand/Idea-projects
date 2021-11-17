package schoolApplication.exceptions;

public class PhoenixClassException  extends Exception{
    public PhoenixClassException(String message){
        super(message);
    }

    public PhoenixClassException(String message, Throwable cause){
        super(message, cause);
    }

    public PhoenixClassException(Throwable cause){
        super(cause);
    }
}
