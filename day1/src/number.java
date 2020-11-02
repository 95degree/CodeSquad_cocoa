import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(">");
        }

        if (num1 < num2) {
            System.out.println("<");
        }

        if (num1 == num2) {
            System.out.println("=");
        }
    }
}
