public class LogLine {
    private final String logLine;
    private final int closedBracketIndex;

    public LogLine(String logLine) {
        this.logLine = logLine;
        this.closedBracketIndex = logLine.indexOf(']');
    }

    public LogLevel getLogLevel() {
        int openBracketIndex = this.logLine.indexOf('[') + 1;
        String parsedLevel = this.logLine.substring(openBracketIndex, this.closedBracketIndex);

        switch (parsedLevel) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        String parsedMessage = this.logLine.substring(this.closedBracketIndex + 3);
        return getLogLevel().encodedLevel + ":" + parsedMessage;
    }
}
