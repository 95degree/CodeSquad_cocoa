import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {

    public static Calendar cal = Calendar.getInstance();
    private int year;
    private int month;

    public CalendarMain(){
        Scanner input = new Scanner(System.in);
        System.out.println("원하는 달과 월을 입력하시오");
        this.year = input.nextInt();
        this.month = input.nextInt();
    }

    public void setToWantCalendar() {
        cal.set(Calendar.YEAR, this.year);
        cal.set(Calendar.MONTH, this.month);
    }

    public void printCalendar(){
        System.out.println("===========달력===========");
        System.out.println("\n");
        System.out.println("========="+this.year+"년==========");
        System.out.println("----------"+this.month+"월----------");
        System.out.println("\n");
        System.out.println("=========================");


    }

    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }



}
