package pr8;

import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {
    private final Image[] frames;
    private int current = 0;

    public Animation(String[] paths) {
        frames = new Image[paths.length];
        for (int i = 0; i < paths.length; i++)
            frames[i] = new ImageIcon(paths[i]).getImage();

        Timer timer = new Timer(200, e -> {
            current = (current + 1) % frames.length;
            repaint();
        });
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames[current] != null)
            g.drawImage(frames[current], 0, 0, getWidth(), getHeight(), this);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Передай пути к кадрам анимации через аргументы командной строки!");
            System.exit(0);
        }

        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new Animation(args));
        frame.setVisible(true);
    }
}