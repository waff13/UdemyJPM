public class ImperialToMetricConverter {

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12)) ) {
            return -1;
        }
        return ( (inches * 2.54) + (feet * (12 * 2.54)) );
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        }
        int feet = (int)(inches / 12);
        if ((feet) > 0) {
            inches = (inches % 12);
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return (inches * 2.54);
        }
    }
}
