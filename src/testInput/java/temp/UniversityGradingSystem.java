package temp;

public class UniversityGradingSystem {

    public static String determineGrade(int score, boolean extraCredit) {
        if (score <= 60) {
            return "C";
        } else if (score < 75) {
            return "B";
        } else if (score < 100) {
            return "A";
        } else if (score == 100 && extraCredit) {
            return "A++";
        } else if (score > 999999999 && extraCredit) {
            return "Don't hack the system plz.";
        } else {
            return null;
        }
    }
}

