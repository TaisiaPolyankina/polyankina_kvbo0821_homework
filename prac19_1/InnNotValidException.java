package polyankina_kvbo0821.prac19_1;

public class InnNotValidException extends Exception{

    private int Inn;

    public int getInn() {
        return Inn;
    }

    public InnNotValidException(int Inn) {
        super("INN " + Inn + " is invalid");
    }

}
