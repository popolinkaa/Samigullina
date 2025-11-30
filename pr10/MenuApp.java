package pr10;

import javax.swing.*;
import java.awt.*;

public class MenuApp extends JFrame {

    public MenuApp() {
        super("Hello Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- Меню ---
        JMenuBar menuBar = new JMenuBar();

        // Меню Файл
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);

        // Меню Edit
        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Copy"));
        editMenu.add(new JMenuItem("Cut"));
        editMenu.add(new JMenuItem("Paste"));
        menuBar.add(editMenu);

        // Меню Help
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        // --- Основной контент (BorderLayout) ---
        setLayout(new BorderLayout());

        // Текстовая область с прокруткой (Центр)
        JTextArea textArea = new JTextArea("This is the area you can write text.");
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Панель с кнопками (Низ)
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("Button 1"));
        buttonPanel.add(new JButton("Button 2"));

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuApp();
    }
}