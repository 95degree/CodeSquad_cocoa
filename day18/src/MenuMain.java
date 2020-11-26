import java.awt.*;

public class MenuMain {

    PanelMain panel;

    public void create() {
        MenuBar menubar = new MenuBar();
        createMenubar(menubar);
        createFrame().setMenuBar(menubar);
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

    public MenuBar createMenubar(MenuBar menubar) {
        Menu fileMenu = new Menu("File");
        Menu drawMenu = new Menu("Draw");
        Menu paintMenu = new Menu("Paint");

        createFileMenuItem(fileMenu);
        createDrawFileMenuItem(drawMenu);

        menubar.add(fileMenu);
        menubar.add(drawMenu);
        menubar.add(paintMenu);

        return menubar;
    }

    public Menu createFileMenuItem(Menu menu) {
        MenuItem newMenuItem = new MenuItem("new");
        MenuItem openMenuItem = new MenuItem("open");
        MenuItem exitMenuItem = new MenuItem("exit");

        menu.add(setFileMenuActionListener(newMenuItem));
        menu.add(setFileMenuActionListener(openMenuItem));
        menu.add(setFileMenuActionListener(exitMenuItem));

        return menu;
    }

    public Menu createDrawFileMenuItem(Menu menu) {
        MenuItem squareMenuItem = new MenuItem("Square");
        MenuItem triangleMenuItem = new MenuItem("Triangle");
        MenuItem straightMenuItem = new MenuItem("Straight");
        MenuItem curveMenuItem = new MenuItem("Curve");
        MenuItem eraserMenuItem = new MenuItem("Eraser");

        menu.add(squareMenuItem);
        menu.add(triangleMenuItem);
        menu.add(straightMenuItem);
        menu.add(curveMenuItem);
        menu.addSeparator();
        menu.add(eraserMenuItem);

        return menu;
    }

    public MenuItem setFileMenuActionListener(MenuItem menuItem) {
        menuItem.addActionListener(new FileMenuEventHandler());
        return menuItem;
    }
}

