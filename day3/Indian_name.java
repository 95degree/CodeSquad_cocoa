import java.util.Scanner;

public class Indian_name {

    public String Year_printout(int Input_year){
        String[] Year_Name = {"말 많은", "푸른", "어두운", "조용한", "웅크린", "백색",
                "지혜로운", "용감한", "날카로운", "욕심많은"};
        return Year_Name[Input_year%10];
    }
    public String Month_printout(int Input_Month){
        String[] Month_Name = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛",
                "말", "돼지", "하늘", "바람"};
        return Month_Name[Input_Month-1];
    }
    public String Day_printout(int Input_Day){
        String[] Day_Name = {"와(과) 함께춤을", "의 기상", "","","", "의 환생", "의 죽음",
                         "아래에서", "를(을) 보라", "이(가) 노래하다.", "그림자", "의 일격",
                         "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령", "을 죽인자","는(은) 맨날 잠잔다.",
                         "처럼","의 고향", "의 전사", "은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼",
                         "의 악마", "와(과) 같은 사나이", "를(을) 쓰러트린자", "의 혼", "은(는) 말이 없다."};
        return Day_Name[Input_Day-1];
    }

    public static void main(String[] args) {
        Indian_name name = new Indian_name();
        Scanner Input = new Scanner(System.in);
        System.out.println("생년월일을 입력해 주세요 >");
        int Year = Input.nextInt();
        int Month = Input.nextInt();
        int Day = Input.nextInt();
        Input.close();
        System.out.println(name.Year_printout(Year)+" "+name.Month_printout(Month)+name.Day_printout(Day));
    }
}