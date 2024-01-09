package week7.LS;

public record RecordLogger(String loggerName) implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("[" + loggerName + "] " + message);
    }
}





