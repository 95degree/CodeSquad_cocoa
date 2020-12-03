import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Map {
    private final static int SIZE = 4;
    private final int[][] rightMap;
    private int[][] map;

    public Map() {
        List<Integer> arrayNumber = new ArrayList<>();
        inputNum(arrayNumber);
        this.rightMap = makeMap(arrayNumber);
        makeGameMap(arrayNumber);
    }

    private void inputNum(List<Integer> number) {
        for (int i = 1; i < SIZE * SIZE; i++) {
            number.add(i);
        }
        number.add(0);
    }

    private void makeGameMap(List<Integer> number) {
        Collections.shuffle(number);
        this.map = makeMap(number);
    }

    private int[][] makeMap(List<Integer> number) {
        int[][] map = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = number.get(i * SIZE + j);
            }
        }
        return map;
    }

    public int[][] getMap() {
        return this.map;
    }

    public int[][] getRightMap() {
        return this.rightMap;
    }

    public int getSize() {
        return SIZE;
    }
}