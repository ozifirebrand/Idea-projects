package africa.semicolon.utils.exceptions;

public class UserDoesNotExistException extends CheetahAppException{
    public UserDoesNotExistException (String message){
        super(message);
    }
}
