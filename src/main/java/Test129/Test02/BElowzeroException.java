package Test129.Test02;

public class BElowzeroException extends Exception{
    static final long serialVersionUID = -7034897290789766939L;

    public BElowzeroException() {
    }

    public BElowzeroException(String message) {
        super(message);
    }

    public BElowzeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public BElowzeroException(Throwable cause) {
        super(cause);
    }

    public BElowzeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
