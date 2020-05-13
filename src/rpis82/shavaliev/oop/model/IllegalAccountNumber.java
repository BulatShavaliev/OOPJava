package rpis82.shavaliev.oop.model;

public class IllegalAccountNumber extends RuntimeException {

    public IllegalAccountNumber()
    {
        super();
    }

    public IllegalAccountNumber(String message)
    {
        super(message);
    }
}
