import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {

    public  Calendar cal = Calendar.getInstance();
    private int year;
    private int month;


    public void init(){
        start();
        scan();
        setCalendar();
        printCalendar();
    }

    public void start(){
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH)+1;
        setCalendar();
        printCalendar();

    }
    public void scan() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n 원하는 년도와 월을 입력하시오");
        this.year = input.nextInt();
        this.month = input.nextInt();
        input.close();
    }


    public void setCalendar() {
        cal.set(Calendar.YEAR, this.year);
        cal.set(Calendar.MONTH, this.month - 1);
        cal.set(Calendar.DATE, 1);
    }


    public void print(){

        for(int i=1; i<cal.get(Calendar.DAY_OF_WEEK); i++){
            System.out.printf("%4s"," ");
        }

        for(int i =1; i<cal.getMaximum(Calendar.DATE); i++){

            System.out.printf("%4d", cal.get(Calendar.DATE));

            if(cal.get(Calendar.DAY_OF_WEEK) == 7)
                System.out.println("\n");

            cal.set(Calendar.DATE, 1+i);
        }
    }


    public void printCalendar() {
        String[] week = {"sun", "mon", "tue", "wen", "tur", "fri", "sat"};
        System.out.println("=============================");
        System.out.printf("%12d 년 %d 월 \n", this.year, this.month);
        System.out.println("=============================");
        for(String a : week)
        System.out.printf("%4s",a);
        System.out.println("\n");
        print();
    }
}

