package africa.semicolon.utils.dtos;

public class UserDoesNotExistException extends RuntimeException{
    public UserDoesNotExistException (String message){
        super(message);
    }
}
