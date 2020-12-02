import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Map {
    private final static int SIZE = 4;
    private int[][] map;
    private int x, y;

    public Map() {
        List<Integer> arrayNumber = new ArrayList<>();
        inputNum(arrayNumber);
    }

    private void inputNum(List<Integer> number) {
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
                findZeroLocation(map[i][j], i, j);
            }
        }
    }

    private void findZeroLocation(int number, int x, int y) {
        if (number == 0) {
            this.x = x;
            this.y = y;
        }
    }

    public void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", this.map[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getMap() {
        return this.map;
    }

    public int getSize() {
        return SIZE;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}