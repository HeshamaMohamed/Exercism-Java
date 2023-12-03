public class LogLevels {

    public static String message(String logLine) {
        int messageStartingIndex = logLine.indexOf(':') + 2;

        return logLine.substring(messageStartingIndex).trim();
    }

    public static String logLevel(String logLine) {
        int openedBracketIndex = logLine.indexOf('[') + 1;
        int closedBracketIndex = logLine.indexOf(']');

        return logLine.substring(openedBracketIndex, closedBracketIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        String levelBetweenParenthesis = " (" + LogLevels.logLevel(logLine) + ")";

        return message + levelBetweenParenthesis;
    }
}
