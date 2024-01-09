package week7;

import week7.LS.ClassLogger;
import week7.LS.Logger;
import week7.LS.RecordLogger;

import java.util.function.Consumer;

public class MainLogger {
    public static void main(String[] args) {
        Logger recordLogger = new RecordLogger("RecordLogger");
        Logger classLogger = new ClassLogger("ClassLogger");

        Consumer<String> recordLogFunction = message -> recordLogger.logMessage(message);
        Consumer<String> classLogFunction = message -> classLogger.logMessage(message);

        recordLogFunction.accept("This is a message from RecordLogger");
        classLogFunction.accept("This is a message from ClassLogger");
    }
}


