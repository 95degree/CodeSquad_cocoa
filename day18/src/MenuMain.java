import java.awt.*;

public class MenuMain {

    PanelMain panel;

    private MenuItem[] fileMenuItems;
    private MenuItem[] drawMenuItems;
    private final String[] file = {"File", "Draw", "Paint"};
    private final String[] fileMenu = {"New", "Open", "Exit"};
    private final String[] draw = {"Square", "Straight", "Curve", "Eraser"};


    public void create() {
        MenuBar menubar = new MenuBar();
    }

    public Frame createFrame() {
        Frame frame = new Frame("그림판");
        panel = new PanelMain();
        frame.setSize(500, 500);
        frame.addWindowListener(new WindowEventHandler());
        frame.setVisible(true);
        frame.add(panel);

        return frame;
    }
}

