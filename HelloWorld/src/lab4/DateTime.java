package lab4;

public class DateTime {

    private int year;
    private int month;
    private int day;

    public DateTime(String dt) {
        String[] values = dt.split("[-./]");
        year = Integer.parseInt(values[0]);
        month = Integer.parseInt(values[1]);
        day = Integer.parseInt(values[2]);
    }

    private int getYearCode(int year) {
        return (year % 100 + (year % 100) / 4) % 7;
    }

    private int getMonthCode(int month) {
        switch (month) {
            case 1: return 0;
            case 2: return 3;
            case 3: return 3;
            case 4: return 6;
            case 5: return 1;
            case 6: return 4;
            case 7: return 6;
            case 8: return 2;
            case 9: return 5;
            case 10: return 0;
            case 11: return 3;
            case 12: return 5;
            default: return 0;
        }
    }

    private int getCenturyCode(int year) {
        int century = year / 100;

        switch (century) {
            case 17: return 4;
            case 18: return 2;
            case 19: return 0;
            case 20: return 6;
            case 21: return 4;
            case 22: return 2;
            case 23: return 0;
            default: return 0;
        }
    }

    private int getLeapYearCode(int year, int month) {

        boolean leap = false;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leap = true;
        }

        if (leap && (month == 1 || month == 2)) {
            return 1;
        }

        return 0;
    }

    private int dayOfWeek() {

        int yearCode = getYearCode(year);
        int monthCode = getMonthCode(month);
        int centuryCode = getCenturyCode(year);
        int leapCode = getLeapYearCode(year, month);

        int result = (yearCode + monthCode + centuryCode + day - leapCode) % 7;

        return result;
    }

    private String getDayName(int code) {
        switch (code) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "";
        }
    }

    public void printDayOfWeek() {

        int code = dayOfWeek();
        String dayName = getDayName(code);

        System.out.println(year + " onii " + month + "-r sariin " + day + " bol " + dayName);
    }
}