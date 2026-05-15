package lab9;



import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;

public class Clock {
    private int year;
    private int month;
    private int day;
    private int time;
    private int minute;
    private int second;
    private LocalDateTime ldt;
    private DateTimeFormatter formatter;

    public Clock() {
    
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public void setClock(int y, int mon, int d, int t, int min, int s) {
        this.year = y;
        this.month = mon;
        this.day = d;
        this.time = t;
        this.minute = min;
        this.second = s;
        ldt = LocalDateTime.of(year, month, day, time, minute, second);

        System.out.println("Clock Manual Configured DateTime is: " + ldt.format(formatter));
    }

    public void autoSetClock() {
        ldt = LocalDateTime.now();
        year = ldt.getYear();
        month = ldt.getMonthValue();
        day = ldt.getDayOfMonth();
        time = ldt.getHour();
        minute = ldt.getMinute();
        second = ldt.getSecond();

        System.out.println("Clock Auto Configured DateTime is: " + ldt.format(formatter));
    }


    public void tickClock() {
        tickClock(1000);
    }

  
    public void tickClock(int tick) {
        System.out.println("-- Ticking clock --");
        for (int i = 0; i < tick; i++) {
            ldt = ldt.plusSeconds(1);
            System.out.println(ldt.format(formatter));
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Clock stopped.");
                return;
            }
        }
    }
}
