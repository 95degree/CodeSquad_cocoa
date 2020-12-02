import java.util.Scanner;

public class GameSystem {

    private final int[][] map;
    private int x, y;
    MoveSystem move;

    public GameSystem(int[][] map, int size) {
        this.map = new int[size][size];
        init(size);
    }

    private void init(int size) {
        printMap(size);
        Scanner input = new Scanner(System.in);
        System.out.println("방향을 입력하세요");
        String direction = input.next();
        this.move = new MoveSystem(direction);
        input.close();
    }

    private void findZeroLocation(int number, int x, int y) {
        if (number == 0) {
            this.x = x;
            this.y = y;
        }
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

    public int[][] getMap() {
        return this.map;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
