package pr8;

import javax.swing.*;
import java.awt.*;

public class ShowImage extends JFrame {
    public ShowImage(String path) {
        super("Image Viewer");

        ImageIcon imageIcon = new ImageIcon(path);
        JLabel label = new JLabel(imageIcon);
        add(label);

        setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к изображению в аргументах командной строки!");
            System.exit(0);
        }
        new ShowImage(args[0]);
    }
}