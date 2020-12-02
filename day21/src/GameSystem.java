import java.util.Scanner;

public class GameSystem {

    private int[][] map;
    private int x, y;

    public GameSystem(int[][] map, int size) {
        this.map = new int[size][size];
        init();
        printMap(size);
    }

    private void init() {
        Scanner input = new Scanner(System.in);
        System.out.println("방향을 입력하세요");
        String direction = input.next();
    }

    public void printMap(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", this.map[i][j]);
                findZeroLocation(this.map[i][j], i, j);
            }
            System.out.println();
        }
    }

    private void findZeroLocation(int number, int x, int y) {
        if (number == 0) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] getMap() {
        return this.map;
    }
}
