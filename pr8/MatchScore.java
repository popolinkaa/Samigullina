package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MatchScore extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public MatchScore() {
        super("Football Match");

        setLayout(new GridLayout(3, 2));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

        milanButton.addActionListener(e -> updateScore("AC Milan"));
        madridButton.addActionListener(e -> updateScore("Real Madrid"));

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateScore(String team) {
        if (team.equals("AC Milan")) {
            milanScore++;
        } else {
            madridScore++;
        }

        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + team);

        if (milanScore > madridScore)
            winnerLabel.setText("Winner: AC Milan");
        else if (madridScore > milanScore)
            winnerLabel.setText("Winner: Real Madrid");
        else
            winnerLabel.setText("Winner: DRAW");
    }

    public static void main(String[] args) {
        new MatchScore();
    }
}
