public class NextDayCalculator {

    public static final String JOIN_CHARACTER = "-";

    public static String nextDayCalculator(int day, int month, int year) {
        String result = ++day + JOIN_CHARACTER + month + JOIN_CHARACTER + year;
        return result;
    }
}
