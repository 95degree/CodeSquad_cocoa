import java.util.Calendar;
import java.util.Scanner;

public class test {

    public static Calendar cal = Calendar.getInstance();
    private int year;
    private int month;

    public void test1() {
        Scanner input = new Scanner(System.in);
        System.out.println("원하는 년도와 월을 입력하시오");
        this.year = input.nextInt();
        this.month = input.nextInt();
        input.close();
    }

    public int getDayOfWeek() {
        cal.set(Calendar.YEAR, this.year);
        cal.set(Calendar.MONTH, this.month - 1);
        cal.set(Calendar.DATE, 1);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    public void print(){

        for(int i=1; i<cal.get(Calendar.DAY_OF_WEEK); i++){
            System.out.printf("%3s"," ");
        }

        for(int i =1; i<cal.getMaximum(Calendar.DATE); i++){

            System.out.printf("%3d", cal.get(Calendar.DATE));

            if(cal.get(Calendar.DAY_OF_WEEK) == 7)
                System.out.println("\n");

            cal.set(Calendar.DATE, 1+i);
        }
    }

    public void printCalendar() {
        char[] week = {'s', 'm', 't', 't', 't', 'f', 's'};
        System.out.println("========================");
        System.out.printf("%9d 년 %d 월 \n", this.year, this.month);
        System.out.println("=========================");
        for(char a : week)
        System.out.printf("%3s",a);
        System.out.println("\n");
        print();

    }

    public static void main(String[] args) {
        test tes = new test();
        tes.test1();
        tes.getDayOfWeek();
        tes.printCalendar();
    }
}

