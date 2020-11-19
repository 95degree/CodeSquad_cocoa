public class ClockKorean {

    private String[] KOREAN = {"한", "두", "세", "네", "다", "섯", "여", "섯", "일", "곱", "여", "덟", "아", "홉", "열", "한", "두", "시",
            "자", "이", "삼", "사", "오", "십", "정", "일", "이", "삼", "사", "육", "오", "오", "칠", "팔", "구", "분"};

    private int hour;
    private int minute;

    public String RESET = "\u001B[0m";
    public String GREEN = "\u001B[36m";


    public void init(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        checkNoonAndMidnight(hour, minute);
        checkHour(hour);
        checkMinute(minute);
        printOutClock();
    }


    public void checkNoonAndMidnight(int hour, int minute) {

        if (hour == 12 && minute == 0) {
            KOREAN[18] = GREEN+KOREAN[18];
            KOREAN[24] = GREEN+KOREAN[24];
        }

        if (hour == 0 && minute == 0) {
            KOREAN[24] = GREEN+KOREAN[24];
            KOREAN[30] = GREEN+KOREAN[30];
        }
    }

    public void printOutClock(){

        KOREAN[17] = GREEN+KOREAN[17];
        KOREAN[35] = GREEN+KOREAN[35];

        for (int i = 0; i < 36; i++) {

            System.out.print(KOREAN[i]+RESET);

            if ((i + 1) % 6 == 0) {
                System.out.print("\n");
            }
        }
    }

    public void checkHour(int hour){
        switch (hour) {

            case 1:
                KOREAN[0] = GREEN+KOREAN[0];
                break;

            case 2:
                KOREAN[1] = GREEN+KOREAN[1];
                break;

            case 3:
                KOREAN[2] = GREEN+KOREAN[2];
                break;

            case 4:
                KOREAN[3] = GREEN+KOREAN[3];
                break;

            case 5:
                KOREAN[4] = GREEN+KOREAN[4];
                KOREAN[5] = GREEN+KOREAN[5];
                break;

            case 6:
                KOREAN[6] = GREEN+KOREAN[6];
                KOREAN[7] = GREEN+KOREAN[7];
                break;

            case 7:
                KOREAN[8] = GREEN+KOREAN[8];
                KOREAN[9] = GREEN+KOREAN[9];
                break;

            case 8:
                KOREAN[10] = GREEN+KOREAN[10];
                KOREAN[11] = GREEN+KOREAN[11];
                break;

            case 9:
                KOREAN[12] = GREEN+KOREAN[12];
                KOREAN[13] = GREEN+KOREAN[13];
                break;

            case 10:
                KOREAN[14] = GREEN+KOREAN[14];
                break;

            case 11:
                KOREAN[14] = GREEN+KOREAN[14];
                KOREAN[15] = GREEN+KOREAN[15];
                break;

            case 12:
                KOREAN[14] = GREEN+KOREAN[14];
                KOREAN[16] = GREEN+KOREAN[16];
                break;

            default:
                break;
        }
    }

    public void checkMinute(int minute){

        if(minute/10 > 0){

            KOREAN[23] = GREEN+KOREAN[23];

            switch(minute/10){

                case 2 :
                    KOREAN[19] = GREEN+KOREAN[19];
                    break;

                case 3 :
                    KOREAN[20] = GREEN+KOREAN[20];
                    break;

                case 4 :
                    KOREAN[21] = GREEN+KOREAN[21];
                    break;

                case 5 :
                    KOREAN[22] = GREEN+KOREAN[22];
                    break;

                default:
                    break;
            }
        }

        switch (minute%10){

            case 1 :
                KOREAN[25] = GREEN+KOREAN[25];
                break;

            case 2 :
                KOREAN[26] = GREEN+KOREAN[26];
                break;

            case 3 :
                KOREAN[27] = GREEN+KOREAN[27];
                break;

            case 4 :
                KOREAN[28] = GREEN+KOREAN[28];
                break;

            case 5 :
                KOREAN[31] = GREEN+KOREAN[31];
                break;

            case 6 :
                KOREAN[29] = GREEN+KOREAN[29] ;
                break;

            case 7 :
                KOREAN[32] = GREEN+KOREAN[32];
                break;

            case 8 :
                KOREAN[33] = GREEN+KOREAN[33];
                break;

            case 9 :
                KOREAN[34] = GREEN+KOREAN[34];
                break;
        }

    }

}

