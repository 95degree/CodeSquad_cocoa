import java.awt.*;

public class TextFieldTest {
    public static void main(String[] args) {

        Frame f = new Frame("test");
        f.setSize(400,65);
        f.setLayout(new FlowLayout());

        Label lid = new Label("id", Label.RIGHT);
        Label lpwd = new Label("pwd", Label.RIGHT);

        TextField id = new TextField(10);
        TextField pwd = new TextField(10);

        pwd.setEchoChar('*');

        f.add(lid);
        f.add(id);
        f.add(lpwd);
        f.add(pwd);
        f.setVisible(true);
    }
}

