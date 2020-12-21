public class NextDayCalculator {

    public static final String JOIN_CHARACTER = "-";
    public static int LASTOFDAY = 31;
    public static final int FIRSTOFDAY = 1;

    public static String nextDayCalculator(int day, int month, int year) {
        checkMonth(month);
        if (day == LASTOFDAY){
            day = FIRSTOFDAY;
            month++;
        } else day ++;
        String result = day + JOIN_CHARACTER + month + JOIN_CHARACTER + year;
        return result;
    }

    private static void checkMonth(int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                LASTOFDAY = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LASTOFDAY = 30;
                break;
        }
    }
}

