import java.util.Objects;
import java.util.Scanner;

public class GameSystem {

    private final int[][] map;
    private final int[][] rightMap;
    private int x, y;
    Scanner input;

    public GameSystem(int[][] map, int size, int[][] rightMap) {
        input = new Scanner(System.in);
        this.map = map;
        this.rightMap = rightMap;
        init(size);
        input.close();
    }

    private void init(int size) {

        while (true) {
            if (Objects.deepEquals(this.map, this.rightMap))
                break;

            printMap(size);
            System.out.println("방향을 입력하세요");
            String direction = input.next();
            move(direction);
        }
        System.out.println("축하합니다.");
    }

    private void findZeroLocation(int number, int x, int y) {
        if (number == 0) {
            this.x = x;
            this.y = y;
        }
    }


    private void move(String direction) {
        try {
            switch (direction) {
                case "s":
                    this.map[x][y] = this.map[x - 1][y];
                    this.map[x - 1][y] = 0;
                    break;

                case "w":
                    this.map[x][y] = this.map[x + 1][y];
                    this.map[x + 1][y] = 0;
                    break;

                case "d":
                    this.map[x][y] = this.map[x][y - 1];
                    this.map[x][y - 1] = 0;
                    break;

                case "a":
                    this.map[x][y] = this.map[x][y + 1];
                    this.map[x][y + 1] = 0;
                    break;

                default:
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("막 다른길 입니다. 다시 입력하세요 \n");
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
