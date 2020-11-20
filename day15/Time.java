import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    private int hour;
    private int minute;


    public Time() {
        String[] hourAndMinute = new String[2];
        hourAndMinute = makeNowTime().split(":");
        this.hour = Integer.parseInt(hourAndMinute[0]);
        this.minute = Integer.parseInt(hourAndMinute[1]);
    }


    public String makeNowTime(){
        Date now = new Date();
        SimpleDateFormat time = new SimpleDateFormat("h:m");
        return time.format(now);
    }


    public int getHour(){
        return this.hour;
    }


    public int getMinute(){
        return this.minute;
    }
}


