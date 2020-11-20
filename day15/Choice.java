import java.util.Scanner;

public class Choice {

    public void choiceCloakOrCalendar(){
        Time time = new Time();
        ClockKorean korean = new ClockKorean();
        CalendarMain calendar = new CalendarMain();
        Scanner input = new Scanner(System.in);

        System.out.println("보고 싶은 것을 선택하시오 (1:한글시계 , 2:달력)");

        int choice = input.nextInt();

        if(choice == 1)
            korean.init(time.getHour(), time.getMinute());

        if(choice == 2)
            calendar.init();
    }
}
