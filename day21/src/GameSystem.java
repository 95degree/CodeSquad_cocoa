import java.util.Scanner;

public class GameSystem {

    private int[][] map;

    public GameSystem(int[][] map, int size) {
       this.map = new int[size][size];

    }

    private void init(){
        Scanner input = new Scanner(System.in);
        System.out.println("방향을 입력하세요");
        String direction = input.next();
        move(direction);
    }

    private void move(String direction){
        switch (direction){
            case "w":

        }
    }

    public int[][] getMap(){
        return this.map;
    }
}
