import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawMenuEventHandler extends Frame implements MouseListener{

    int x= 0;
    int y =0;

    @Override
    public void mousePressed(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
    }
    public void paint(Graphics g){

    }
    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e)  { }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

}
