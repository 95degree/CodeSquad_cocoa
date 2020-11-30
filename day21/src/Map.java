import java.util.Random;

public class Map {
    private final static int SIZE = 4;
    private int[][] map;

    public Map() {
        init();
    }

    private void init() {
        int[] number = new int[SIZE * SIZE];
        inputNum(number);
        makeMap(number);
    }

    private void inputNum(int[] number) {
        Random random = new Random();
        for (int i = 0; i < SIZE * SIZE; i++) {
            number[i] = i ;
        }
        for (int i = number.length - 1; i > 0; i--) {
            shuffle(number, i, random.nextInt(i));
        }
    }

    private void shuffle(int[] arrayNumber, int i, int randomNumber) {
        int save = arrayNumber[i];
        arrayNumber[i] = arrayNumber[randomNumber];
        arrayNumber[randomNumber] = save;
    }

    private void makeMap(int[] arrayNumber) {
        this.map = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.map[i][j] = arrayNumber[i * SIZE + j];
            }
        }
    }

    public int[][] getMap() {
        return this.map;
    }

    public void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", this.map[i][j]);
            }
            System.out.println();
        }
    }
}