package pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    JTextField tf1, tf2;
    JLabel resultLabel;

    public SimpleCalculator() {
        super("Простой калькулятор");
        setLayout(new FlowLayout());
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Поля ввода
        add(new JLabel("Число 1:"));
        tf1 = new JTextField(10);
        add(tf1);

        add(new JLabel("Число 2:"));
        tf2 = new JTextField(10);
        add(tf2);

        // Кнопки
        JButton btnAdd = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMul = new JButton("*");
        JButton btnDiv = new JButton("/");

        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);

        resultLabel = new JLabel("Результат: ");
        add(resultLabel);

        // Логика кнопок через Анонимные классы
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });

        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });

        setVisible(true);
    }

    // Метод для вычислений, чтобы не дублировать код
    private void calculate(char op) {
        try {
            double n1 = Double.parseDouble(tf1.getText());
            double n2 = Double.parseDouble(tf2.getText());
            double res = 0;

            switch (op) {
                case '+': res = n1 + n2; break;
                case '-': res = n1 - n2; break;
                case '*': res = n1 * n2; break;
                case '/':
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(this, "Деление на ноль!");
                        return;
                    }
                    res = n1 / n2;
                    break;
            }
            resultLabel.setText("Результат: " + res);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите корректные числа!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}