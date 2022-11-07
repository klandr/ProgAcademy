package exception.classwork;

public class NegativePriceException extends Exception {
    public NegativePriceException() {
        super();
    }

    public NegativePriceException(String message) {
        super(message);
    }

    public NegativePriceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativePriceException(Throwable cause) {
        super(cause);
    }
}
