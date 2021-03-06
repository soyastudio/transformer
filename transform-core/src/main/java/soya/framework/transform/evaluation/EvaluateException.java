package soya.framework.transform.evaluation;

public class EvaluateException extends RuntimeException {
    public EvaluateException() {
    }

    public EvaluateException(String message) {
        super(message);
    }

    public EvaluateException(String message, Throwable cause) {
        super(message, cause);
    }

    public EvaluateException(Throwable cause) {
        super(cause);
    }
}
