import java.util.*;

public class OddOrEven {
    private final static int MYFIRSTCOST = 100;
    private final static int OPPONENTFIRSTCOST = 120;
    private final static int SIZE = 20;

    int mycost = 0, opponentcost = 0, turn = 0;
    List<Id> id = new ArrayList<>();

    // 1~SIZE 사이의 난수 생성 //
    public int random(){
        Random number = new Random();
        return number.nextInt(SIZE)+1;
    }


    //정답//
    public String printoutOddorEven(int randomnumber){
        if(randomnumber%2==0){
            return "짝";
        }
        return "홀";
    }


    //홀짝 과 배팅할 금액 입력 후 확인//
    public void inputAnswerAndCost(String correct){
        Scanner inputanswer = new Scanner(System.in);
        System.out.println("홀 짝을 입력하시오");
        String myanswer = inputanswer.next();
        System.out.println("****** 소지금 나 : "+this.mycost+"원 상대방 : "+this.opponentcost+"원 ******");
        System.out.println("배팅하시오");
        int cost = inputanswer.nextInt();
        while(cost>Math.min(this.mycost, this.opponentcost)){
            System.out.println("다시 배팅하시오. 최대 : "+Math.min(this.mycost, this.opponentcost)+"원");
            cost = inputanswer.nextInt();
        }
        match(myanswer,cost, correct);
        this.turn ++;
    }


    //정답 유뮤에 따른 소지금 계산//
    public void match(String myanswer, int cost, String correct){

        if(myanswer.equals(correct)){
            this.mycost+=cost;
            this.opponentcost-=cost;
            return;
        }
            this.mycost-=cost;
            this.opponentcost+=cost;
        }


    //다음 라운드 진행시 상대방 소지금 계산//
    public void goNextRound(int numStage) {
        System.out.println("축하합니다. " + numStage + "라운드 통과");
        System.out.println("=================================");
        System.out.println(numStage+1 + "라운드");
        this.opponentcost = (int) (this.mycost * Math.pow(1.2, numStage));
        System.out.println("****** 소지금 나 : " + this.mycost + "원 상대방 : " + this.opponentcost + "원 ******");
    }


    //게임 오버 후 소지금과 진행턴 표시//
    public void printout(int numstage){
        System.out.println("게임 끝");
        saveId(numstage);
        System.out.println("소지금 : "+this.mycost+"원");
        System.out.println("진행턴 : "+this.turn+"턴\n");

    }


    //전체 게임//
    public void game(){
        this.mycost = MYFIRSTCOST;
        this.opponentcost = OPPONENTFIRSTCOST;
        int numstage = 1;
        while(true) {
            String correct = new String();
            int randomnum = random();

            //홀짝 정답 저장//
            correct = printoutOddorEven(randomnum);

            inputAnswerAndCost(correct);
            System.out.println("정답 : " + correct + " (" + randomnum + ")");
            System.out.println("****** 소지금 나 : " + this.mycost + "원 상대방 :" + this.opponentcost + "원 ******\n");

            //내 소지금이 0원일 경우 게임 오버//
            if(this.mycost==0){
                printout(numstage);
                break;
            }
            //상대방 소지금이 0원일 경우 다음 라운드//
            if(this.opponentcost==0){

                //8탄 까지 깨면 게임 오버//
                if(numstage==8) {
                    System.out.println("축하합니다. 미션 성공");
                    printout(numstage);
                    break;
                }
                goNextRound(numstage);
                numstage++;
            }
        }
    }


    //list에 아이디, 턴, 라운드 저장
    public void saveId(int numstage){
        Scanner forid = new Scanner(System.in);
        System.out.print("이름을 입력하시오 : ");
        String name = forid.next();
        id.add(new Id(name,turn,numstage));
    }


    //랭킹을 위한 비교//
        public void compareRanking(){
        Collections.sort(id,new CompareToStage());
        Collections.sort(id, (Id o1, Id o2)->{
            return o1.getTurn()-o2.getTurn();
        });
    }


    //랭킹 출력//
    public void printOutRanking(){
        compareRanking();
        System.out.println("순위   이름   라운드   턴");
        for(int i =0 ; i<id.size(); i++){
            System.out.println(" "+(i+1)+"    "+id.get(i).getId()+"   "+id.get(i).getStage()+"      "+id.get(i).getTurn());
        }
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
                System.out.println("게임 종료");
                return;
            }
        }
    }


    //메인//
    public static void main(String[] args) {
        OddOrEven oddorEven = new OddOrEven();
        oddorEven.initGame();
        oddorEven.printOutRanking();
    }
}


