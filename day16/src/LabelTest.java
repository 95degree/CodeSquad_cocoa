import java.awt.*;

public class LabelTest {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(300,200);

        Label id = new Label("id  : ");
        id.setSize(100,50);
        f.add(id);
        f.setVisible(true);
    }
}
