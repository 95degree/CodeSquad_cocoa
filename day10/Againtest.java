import java.util.Scanner;

public class Againtest {

    public void game(){
        System.out.println("게임 시작");
    }
    public Boolean againStart(){
        Scanner yesOrNo = new Scanner(System.in);
        System.out.println("다시 하시겠습니까?: Y ,N");
        String answer = yesOrNo.next();
        if(answer.equals("Y")){
            return true;
        }
        return false;
    }

    public void initGame() {
        while (true) {
            game();
            if (!againStart()) {
                System.out.println("끝");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Againtest test = new Againtest();
        test.initGame();
    }
}
