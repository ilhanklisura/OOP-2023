package week7.loggingsystem;

public class ClassLogger implements Logger {
    private String loggerName;

    public ClassLogger(String loggerName) {
        this.loggerName = loggerName;
    }

    @Override
    public void logMessage(String message) {
        System.out.println("[" + loggerName + "] " + message);
    }
}


