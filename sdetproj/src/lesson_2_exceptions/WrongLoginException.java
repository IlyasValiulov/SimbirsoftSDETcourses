package lesson_2_exceptions;

public class WrongLoginException extends Exception{

    public WrongLoginException() {}

    public WrongLoginException(String message) {
        super(message);
    }
}
