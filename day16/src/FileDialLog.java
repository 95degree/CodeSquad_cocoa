import java.awt.*;


public class FileDialLog {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setSize(300,200);

        FileDialog fileOpen = new FileDialog(f, "파일열기", FileDialog.LOAD);

        f.setVisible(true);
        fileOpen.setDirectory("C:\\Users\\사용자");
        fileOpen.setVisible(true);

        System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
    }


}
