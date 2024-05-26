import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeFrame extends JFrame {

    public TicTacToeFrame() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new BorderLayout());

        welcomePanel.setBackground(new Color(135, 206, 235));

        JLabel welcomeLabel = new JLabel("Welcome to Tic Tac Toe", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        welcomeLabel.setForeground(new Color(255, 69, 0));

        JButton startButton = new JButton("Start Game");
        startButton.setFont(new Font("Arial", Font.PLAIN, 20));
        startButton.setBackground(new Color(150, 205, 50));
        startButton.setForeground(new Color(0, 0, 0));
        startButton.setFocusPainted(false);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start Game button clicked!");
            }
        });

        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);
        welcomePanel.add(startButton, BorderLayout.SOUTH);

        add(welcomePanel);
    }
}
