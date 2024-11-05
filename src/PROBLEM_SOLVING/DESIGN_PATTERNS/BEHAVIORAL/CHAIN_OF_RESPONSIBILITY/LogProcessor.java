package PROBLEM_SOLVING.DESIGN_PATTERNS.BEHAVIORAL.CHAIN_OF_RESPONSIBILITY;
/*
* Chain of Responsibility Design Pattern
* */

// ! Abstract Handler
public abstract class LogProcessor {
    public static String INFO = "INFO";
    public static String DEBUG = "DEBUG";
    public static String ERROR = "ERROR";

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(String logLevel, String message) {
        if (null != nextLogProcessor) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}

// ! Concrete Handler 1 is an Abstract Handler
class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if (LogProcessor.INFO.equalsIgnoreCase(logLevel)) {
            System.out.println(LogProcessor.INFO + ": " + message);
        }
        super.log(logLevel, message);
    }
}
// ! Concrete Handler 2 is an Abstract Handler
class DebugLogProcessor extends LogProcessor {

    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if (LogProcessor.DEBUG.equalsIgnoreCase(logLevel)) {
            System.out.println(LogProcessor.DEBUG + ": " + message);
        }
        super.log(logLevel, message);
    }
}
// ! Concrete Handler 3 is an Abstract Handler
class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if (LogProcessor.ERROR.equalsIgnoreCase(logLevel)) {
            System.out.println(LogProcessor.ERROR + ": " + message);
        }
        super.log(logLevel, message);
    }
}

class ChainOfResponsibilityDriver {
    public static void main(String[] args) {
        // ! Here we have used InfoLogger at the beginning as in our application we might use Info logs more frequently.
        // ! To avoid multiple constructor calls for frequent used log type INFO we used it at first.
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR,"Log Log Log!!");

    }
}