import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelMain extends Panel {

    int x = 0;
    int y = 0;


    public PanelMain() {

        this.setSize(500, 500);
        this.setBackground(Color.WHITE);
        this.addEvent();
    }

    public void addEvent() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e){
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        String bar = "Square";
        switch (bar) {
            case "Square":
                g.drawRect(x, y, 100, 100);
                break;

            case "Straight":
                g.drawLine(x, y, x + 50, y + 50);
                break;

            case "Curve":
                g.drawOval(x, y, 100, 100);
                break;

            case "Eraser":
                g.clearRect(x, y, 50, 50);
                break;

            default:
                break;
        }
    }
}


