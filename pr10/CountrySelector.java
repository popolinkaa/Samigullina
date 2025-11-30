package pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelector extends JFrame {

    public CountrySelector() {
        super("Hello Swing"); // Заголовок как на рис 15.8
        setLayout(new FlowLayout());
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> comboBox = new JComboBox<>(countries);

        JLabel infoLabel = new JLabel("Выберите страну из списка");

        // Обработка выбора
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                infoLabel.setText("Выбрана страна: " + selected);
            }
        });

        add(comboBox);
        add(infoLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountrySelector();
    }
}
