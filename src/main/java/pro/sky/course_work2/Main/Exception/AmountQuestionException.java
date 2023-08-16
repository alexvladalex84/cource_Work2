package pro.sky.course_work2.Main.Exception;

public class AmountQuestionException extends RuntimeException {
    public AmountQuestionException() {
    }

    public AmountQuestionException(String message) {
        super(message);
    }

    public AmountQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountQuestionException(Throwable cause) {
        super(cause);
    }

    public AmountQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
