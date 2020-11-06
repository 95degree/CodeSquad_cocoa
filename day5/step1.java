import java.util.Scanner;

public class step1 {
    private int numA, numB;

    public int input() {
        Scanner input = new Scanner(System.in);
        int numA = input.nextInt();
        int numB = input.nextInt();
        if (check(numA) == true && check(numB) == true) {
            this.numA = numA;
            this.numB = numB;
            return this.numA+ this.numB;
            }
        return 0;
        }

    public boolean check(int num) {
        if (0 < num && num < 10) {
            return true;
        }
        System.out.println("다시 입력하시오");
        return false;
    }
    public void printout(){
        System.out.println(this.numA + this.numB);
    }
    public static void main(String[] args) {
        step1 sumNumber = new step1();
        int checkSum = sumNumber.input();
        while(checkSum==0){
            checkSum = sumNumber.input();
        }
        sumNumber.printout();
    }
}