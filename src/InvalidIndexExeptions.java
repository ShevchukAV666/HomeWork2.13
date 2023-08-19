public class InvalidIndexExeptions extends RuntimeException {

    public InvalidIndexExeptions() {
    }

    public InvalidIndexExeptions(String message) {
        super(message);
    }

    public InvalidIndexExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIndexExeptions(Throwable cause) {
        super(cause);
    }

    public InvalidIndexExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
