package mktadmin.mktadminbe;

public class NotFoundByIdException extends RuntimeException{
    public NotFoundByIdException(String errorMessage) {
        super(errorMessage);
    }
}
