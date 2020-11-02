import java.util.Scanner;

public class gugudan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for(int i = num1; i <= num2; ++i) {
            for(int j = 1; j <= 9; ++j) {
                System.out.println(i + "*" + j + "=" + i * j);
                }
            }
        }
    }



