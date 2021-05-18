public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.print(minutes + " min = ");
            int years = (int) (minutes / (60 * 24 * 365));
            if (years > 0) {
                minutes = (minutes % (60 * 24 * 365));
            }
            int days = (int) (minutes / (60 * 24));
            if (days > 0) {
                minutes = (minutes % (60 * 24));
            }
            System.out.println(years + " y and " + days + " d");
        }
    }
}
