import java.awt.*;

public class ButtonTest {
    public static void main(String[] args) {
        Frame f = new Frame("button");
        f.setSize(300,200);
        Button b = new Button("wow");
        b.setSize(100,50);
        f.add(b);
        f.setVisible(true);
    }
}
