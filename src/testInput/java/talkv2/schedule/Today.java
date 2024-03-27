package talkv2.schedule;

public class Today {
    public static String whatToDo(int hour) {
        if (hour >= 0 && hour <= 11) {
            return "Sleep";
        } else if (hour == 12) {
            return "Get free lunch at PLSE";
        } else if (hour <= 23){
            return "Sleep more";
        }
        return null;
    }

//    public static String whatToDo(int hour) {...}

    public static boolean isLunchTime1(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime2(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime3(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime4(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime5(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime6(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime7(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime8(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime9(int hour) {
        return hour == 12;
    }

    public static boolean isLunchTime10(int hour) {
        return hour == 12;
    }

    // other countless isLunchTime methods

}
