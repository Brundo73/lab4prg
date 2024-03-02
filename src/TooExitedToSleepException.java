public class TooExitedToSleepException extends RuntimeException {
    TooExitedToSleepException(String name) {
        super(name + " слишком взволнован, чтобы уснуть");
    }
}
