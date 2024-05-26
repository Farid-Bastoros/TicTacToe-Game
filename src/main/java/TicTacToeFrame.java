import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeFrame extends JFrame {

    private JButton[][] buttons;
    private boolean playerXTurn;
    private JLabel statusLabel;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public TicTacToeFrame() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

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
                cardLayout.show(mainPanel, "GamePanel");
            }
        });

        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);
        welcomePanel.add(startButton, BorderLayout.SOUTH);

        JPanel gamePanel = new JPanel(new BorderLayout());

        buttons = new JButton[3][3];
        JPanel boardPanel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[i][j].setFocusPainted(false);
                boardPanel.add(buttons[i][j]);
            }
        }

        statusLabel = new JLabel("Player X's turn");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        gamePanel.add(boardPanel, BorderLayout.CENTER);
        gamePanel.add(statusLabel, BorderLayout.SOUTH);

        mainPanel.add(welcomePanel, "WelcomePanel");
        mainPanel.add(gamePanel, "GamePanel");

        playerXTurn = true;

        add(mainPanel);

        cardLayout.show(mainPanel, "WelcomePanel");
    }
}
