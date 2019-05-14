import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    JPanel mainPanel = new JPanel();
    JPanel controlPanel = new JPanel();
    JButton redButton = new JButton("RED");
    JButton greenButton = new JButton("GREEN");
    JButton blueButton = new JButton("BLUE");

    Main() {
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.setBackground(Color.RED);

        controlPanel.setBackground(Color.DARK_GRAY);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("My");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}

