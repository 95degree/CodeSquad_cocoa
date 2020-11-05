import java.util.Scanner;

public class IndianName {

    int year, month, day;
    String[] yearName = {"말 많은", "푸른", "어두운", "조용한", "웅크린", "백색",
                "지혜로운", "용감한", "날카로운", "욕심많은"};
    String[] monthName = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛",
                "말", "돼지", "하늘", "바람"};
    String[] dayName = {"와(과) 함께춤을", "의 기상", "","","", "의 환생", "의 죽음",
                "아래에서", "를(을) 보라", "이(가) 노래하다.", "그림자", "의 일격",
                "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령", "을 죽인자","는(은) 맨날 잠잔다.",
                "처럼","의 고향", "의 전사", "은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼",
                "의 악마", "와(과) 같은 사나이", "를(을) 쓰러트린자", "의 혼", "은(는) 말이 없다."};


    public static void main(String[] args) {
        IndianName name = new IndianName();
        System.out.println("생년월일을 입력해 주세요 >");
        name.getFromKeyBoard();
        name.printOutName();
    }

    public void getFromKeyBoard(){
        Scanner input = new Scanner(System.in);
        this.year = input.nextInt();
        this.month = input.nextInt();
        this.day = input.nextInt();
    }

    public void printOutName(){
        String correctYearName = this.yearName[this.year%10];
        String correctMonthName = this.monthName[this.month-1];
        String correctDayName = this.dayName[this.day-1];
        printoutSumName(correctYearName, correctMonthName, correctDayName);
    }

    private void printoutSumName(String realYearName, String realMonthName, String realDayName){

        System.out.print(realYearName+" "+realMonthName+realDayName);
    }

}
