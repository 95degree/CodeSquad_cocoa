import java.awt.*;

public class ChoiceTest {
    public static void main(String[] args) {
        Frame f = new Frame("Choice - Select");
        f.setSize(300,200);
        f.setLayout(null);

        Choice day = new Choice();
        String[]date = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};

        for(String a : date)
        day.add(a);

        day.setSize(100,50);
        day.setLocation(100,70);

        f.add(day);
        f.setVisible(true);
    }
}
