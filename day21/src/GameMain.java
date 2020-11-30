public class GameMain {
    public static void main(String[] args) {
        Map map = new Map();
        GameSystem game = new GameSystem(map.getMap(),map.getSize());
    }
}
