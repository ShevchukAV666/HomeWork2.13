public class ElementNotFoundExeptions extends RuntimeException {

    public ElementNotFoundExeptions() {
    }

    public ElementNotFoundExeptions(String message) {
        super(message);
    }

    public ElementNotFoundExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFoundExeptions(Throwable cause) {
        super(cause);
    }

    public ElementNotFoundExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
