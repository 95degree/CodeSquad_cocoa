import java.time.LocalTime;

public class ClockMain {
    String[]korean = {"한", "두", "세", "네", "다", "섯", "여", "섯", "일", "곱", "여", "덟", "아", "홉", "열","한","두","시",
            "자", "이", "삼", "사", "오", "십", "정", "일", "이", "삼", "사", "육", "오", "오", "칠", "팔", "구", "분"};

    public void printOutTime(){
        for(int i=0; i<36; i++){
            System.out.print(" "+korean[i]);

            if((i+1)%6==0) {
                System.out.print("\n");
            }
        }
    }

    public void printOutLocalTime(){
        LocalTime now = LocalTime.now();
    }
    public static void main(String[] args) {
        ClockMain clock = new ClockMain();
        clock.printOutTime();
    }
}
