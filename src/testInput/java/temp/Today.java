package temp;

import org.junit.Test;

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

//    public static int LUNCH_TIME = 12;
//
//    public static String whatToDo(int hour) {...}
//
//    public static boolean isLunchTimeForAllan(int hour) {
//        return hour == LUNCH_TIME;
//    }
//
//    public static boolean isLunchTimeForTian(int hour) {
//        return hour == LUNCH_TIME;
//    }

    // other 8 isLunchTime methods (10 in total)
////
//    public static boolean isLunchTime3(int hour) {
//        return hour == 12;
//    }
//
//    public static boolean isLunchTime4(int hour) {
//        return hour == 12;
//    }
//
//    public static boolean isLunchTime5(int hour) {
//        return hour == 12;
//    }
//
//    public static boolean isLunchTime6(int hour) {
//        return hour == 12;
//    }
//
//    public static boolean isLunchTime7(int hour) {
//        return hour == 12;
//    }
//
//    public static boolean isLunchTime8(int hour) {
//        return hour == 12;
//    }
//
//    public static boolean isLunchTime9(int hour) {
//        return hour == 12;
//    }
//
//    public static boolean isLunchTime10(int hour) {
//        return hour == 12;
//    }
//
//    // other countless isLunchTime methods

}


