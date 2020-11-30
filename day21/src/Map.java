import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Map {
    private final static int SIZE = 4;
    private int[][] map;

    public Map() {
        List<Integer> arrayNumber = new ArrayList<>();
        inputNum(arrayNumber);
    }

    private void inputNum(List<Integer> number) {
        Random random = new Random();
        for (int i = 0; i < SIZE * SIZE; i++) {
            number.add(i);
        }
        Collections.shuffle(number);
        makeMap(number);
    }

    private void makeMap(List<Integer> number) {
        this.map = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.map[i][j] = number.get(i * SIZE + j);
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