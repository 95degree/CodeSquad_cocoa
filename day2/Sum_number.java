import java.util.Scanner;

public class Sum_number {

    public int Lenth;
    public String num;

    public void NumInput(){
        Scanner input = new Scanner(System.in);
        this.Lenth = input.nextInt();
        this.num = input.next();
        input.close();
    }

    public void NumOut(){
        int sum = 0 ;
        if(this.Lenth<this.num.length()){
            System.out.println("다시 입력하시오");
            return;
        }
        for(int i=0; i< this.Lenth; i++){
            sum+=num.charAt(i)-48;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Sum_number number = new Sum_number();
        number.NumInput();
        number.NumOut();
    }
}
