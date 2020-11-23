import java.awt.*;

public class ScrollTest {
    public static void main(String[] args) {
        Frame f = new Frame("Scroll");
        f.setSize(300,200);
        f.setLayout(null);

        Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 100);
        hor.setSize(100,15);
        hor.setLocation(100,100);
        Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 0, 20, 0, 100);
        ver.setSize(15, 100);
        ver.setLocation(30,60);

        f.add(hor);
        f.add(ver);
        f.setVisible(true);
    }
}

