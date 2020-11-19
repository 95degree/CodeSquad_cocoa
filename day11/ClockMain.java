import java.util.Scanner;

public class ClockMain {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ClockKorean korean = new ClockKorean();
        Time time = new Time();
        korean.init(time.getHour(), time.getMinute());
    }
}
