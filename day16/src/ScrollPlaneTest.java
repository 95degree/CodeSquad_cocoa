import java.awt.*;

public class ScrollPlaneTest {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(300,200);

        ScrollPane scroll = new ScrollPane();
        Panel p = new Panel();
        p.setBackground(Color.CYAN);
        p.add(new Button("세번째"));
        scroll.add(p);
        f.add(scroll);
        f.setVisible(true);

    }

}
