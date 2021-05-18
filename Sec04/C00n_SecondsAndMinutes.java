public class SecondsAndMinutesChallenge {

    public static String getDurationString (int minutes, int seconds) {
        if ( (minutes < 0) || ( (seconds < 0) || (seconds > 59) ) ) {
            return "Invalid value";
        }
        int hours = (minutes / 60);
        if (hours > 0) {
            minutes = (minutes % 60);
            return ((hours < 10) ? "0" : "") + hours + "h " + ((minutes < 10) ? "0" : "" ) + minutes + "m " +
                    ((seconds < 10) ? "0" : "" ) + seconds + "s";
        }
        return ((minutes < 10) ? "0" : "" ) + minutes + "m " + ((seconds < 10) ? "0" : "" ) + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = (seconds / 60);
        seconds = (seconds % 60);
        return getDurationString(minutes, seconds);
    }
}
