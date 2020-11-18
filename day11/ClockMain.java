import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockMain {

    public String makeNowTime(){
        Date now = new Date();
        SimpleDateFormat time = new SimpleDateFormat("h:m");
        return time.format(now);
    }

    public static void main(String[] args) {
        ClockMain clock = new ClockMain();
        ClockKorean korean = new ClockKorean();
        Time time = new Time (clock.makeNowTime());
        korean.init(time.getHour(), time.getMinute());
    }
}
