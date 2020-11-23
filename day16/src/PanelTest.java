import java.awt.*;

public class PanelTest {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(500,500);
        f.setLayout(null);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.blue);
        canvas.setBounds(100,50, 10, 10);

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.PINK);

        panel.setBounds(200,50, 250,250);
        Button b = new Button("wow");
        b.setLocation(10,10);
        b.setSize(10,10);


        panel.add(b);
        f.add(panel);
        f.add(canvas);
        f.setVisible(true);

    }
}
