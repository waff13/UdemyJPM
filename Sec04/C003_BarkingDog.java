public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (!isBarking) {
            return false;
        } else if ( (hourOfDay >=0) && (hourOfDay <8) ) {
            return true;
        } else if ((hourOfDay == 23)) {
            return true;
        } else {
            return false;
        }
    }
}
