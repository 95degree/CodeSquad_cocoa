import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileMenuEventHandler implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command.equals("exit"))
            System.exit(0);
    }
}
