import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        Scanner divisionNum = new Scanner(System.in);
        double a = divisionNum.nextDouble();
        double b = divisionNum.nextDouble();
        divisionNum.close();
        System.out.println(a/b);
    }
}
