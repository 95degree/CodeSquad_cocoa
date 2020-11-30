import java.util.Random;

public class Map {
    private final static int SIZE = 4;
    private int[][] map;
    private int[] number;

    public Map() {
        this.number = new int[SIZE * SIZE];
        init();
    }

    private void init() {
        inputNum();
        inputRandomNum();
    }

    private void inputNum() {
        for (int i = 0; i < SIZE * SIZE; i++) {
            number[i] = i + 1;
        }
    }

    private void inputRandomNum() {
        Random random = new Random();
        for (int a : number) {
        }
    }
}
