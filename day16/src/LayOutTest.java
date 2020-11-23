import java.awt.*;

public class LayOutTest {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(300,200);
        f.setLayout(null);

        Button b = new Button("test");
        b.setSize(100,50);
        b.setLocation(100,100);

        f.add(b);
        f.setVisible(true);
    }
}
