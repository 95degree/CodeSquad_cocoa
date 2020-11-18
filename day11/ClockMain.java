public class ClockMain {


    public static void main(String[] args) {
        ClockKorean korean = new ClockKorean();
        Time time = new Time();
        korean.init(time.getHour(), time.getMinute());
    }
}
