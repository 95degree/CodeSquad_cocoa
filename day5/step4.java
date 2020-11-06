import java.util.Scanner;

public class step4 {

    static final int BOUNDARY = 8;
    static final int [] cMajor ={1, 2, 3, 4, 5, 6, 7, 8};

    public int[] getFromKeyBoard() {
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[BOUNDARY];
        for (int i = 0; i < BOUNDARY; i++) {
            numArray[i] = input.nextInt();
        }
        return numArray;
    }
    public String check(int numArray[]){
        if(cMajor.equals(numArray)){
            return "ascending";
        }
        if(reverseCmajor().equals(numArray)){
            return "descending";
        }
        return "mixed";
    }

    public int[] reverseCmajor(){
        int [] reversemajor = new int [cMajor.length];
        for(int i=1; i<cMajor.length; i++) {
            reversemajor[i-1] = cMajor[cMajor.length - i];
        }
        return reversemajor;
    }

    public static void main(String[] args) {
        step4 solution = new step4();
        System.out.println(solution.check(solution.getFromKeyBoard()));
    }

}




