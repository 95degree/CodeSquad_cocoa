import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends Panel {

    int x = 0;
    int y = 0;

    public MyPanel() {
        this.setSize(500, 500);
        this.setBackground(Color.WHITE);

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
    }
}

