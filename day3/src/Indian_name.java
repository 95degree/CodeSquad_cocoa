import java.util.Scanner;

public class Indian_name {
    public static void main(String[] args) {
        System.out.println("생년월일을 입력해 주세요 >");
        Scanner Input = new Scanner(System.in);
        int year = Input.nextInt();
        int Month = Input.nextInt();
        int Day = Input.nextInt();
        String Year_name = "", Month_name = "", Day_name = "";
        Input.close();

        year = year%10 ;
        switch(year){
            case 0 :
                Year_name = "말 많은";
                break;
            case 1 :
                Year_name = "푸른";
                break;
            case 2 :
                Year_name = "어두운";
                break;
            case 3 :
                Year_name = "조용한";
                break;
            case 4 :
                Year_name = "웅크린";
                break;
            case 5 :
                Year_name = "백새";
                break;
            case 6 :
                Year_name = "지혜로운";
                break;
            case 7 :
                Year_name = "용감한";
                break;
            case 8 :
                Year_name = "날카로운";
                break;
            case 9 :
                Year_name = "욕심많은";
                break;
        }
        switch(Month){
            case 1 :
                Month_name = "늑대";
                break;
            case 2 :
                Month_name = "태양";
                break;
            case 3 :
                Month_name = "양";
                break;
            case 4 :
                Month_name = "매";
                break;
            case 5 :
                Month_name = "황소";
                break;
            case 6 :
                Month_name = "불꽃";
                break;
            case 7 :
                Month_name = "나무";
                break;
            case 8 :
                Month_name = "달빛";
                break;
            case 9 :
                Month_name = "말";
                break;
            case 10 :
                Month_name = "돼지";
                break;
            case 11:
                Month_name = "하늘";
                break;
            case 12:
                Month_name = "바람";
                break;
        }

         switch(Day){
             case 1 :
                 Day_name = "와(과) 함께 춤을";
                 break;
             case 2 :
                 Day_name = "의 기상";
                 break;
             case 3 :
                 Day_name = "은(는) 그림자속에";
                 break;
             case 4 :
             case 5 :
             case 6 :
                 Day_name = "";
                 break;
             case 7 :
                 Day_name = "의 환생";
                 break;
             case 8 :
                 Day_name= "의 죽음";
                 break;
             case 9 :
                 Day_name = "아래에서";
                 break;
             case 10 :
                 Day_name = "를(을) 보라";
                 break;
             case 11:
                 Day_name = "이(가) 노래하다";
                 break;
             case 12:
                 Day_name = "의 그림자";
                 break;
             case 13:
                 Day_name = "의 일격";
                 break;
             case 14:
                 Day_name = "에게 쫓기는 남자";
                 break;
             case 15 :
                 Day_name = "의 행진";
                 break;
             case 16 :
                 Day_name = "의 왕";
                 break;
             case 17 :
                 Day_name = "의 유령";
                 break;
             case 18 :
                 Day_name = "을 죽인자";
                 break;
             case 19 :
                 Day_name = "는(은) 맨날 잠잔다";
                 break;
             case 20 :
                 Day_name = "처럼";
                 break;
             case 21 :
                 Day_name = "의 고향";
                 break;
             case 22 :
                 Day_name = "의 전사";
                 break;
             case 23 :
                 Day_name = "은(는) 나의 친구";
                 break;
             case 24 :
                 Day_name = "의 노래";
                 break;
             case 25 :
                 Day_name = "의 정령";
                 break;
             case 26 :
                 Day_name = "의 파수꾼";
                 break;
             case 27 :
                 Day_name = "의 악마";
                 break;
             case 28 :
                 Day_name = "와(과) 같은 사나이";
                 break;
             case 29 :
                 Day_name = "를(을) 쓰러트린자";
                 break;
             case 30 :
                 Day_name = "의 혼";
                 break;
             case 31 :
                 Day_name = "은(는) 말이 없다";
                 break;
        }
        System.out.println("당신의 이름은 "+Year_name+" "+Month_name+Day_name+"입니다.");
    }
}
