import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    JPanel mainPanel = new JPanel();
    JPanel controlPandel = new JPanel();

    JButton redButton = new JButton("RED");
    JButton blueButton = new JButton("BLUE");
    JButton greenButton = new JButton("GREEN");

    Main() {
        setLayout(new BorderLayout());

        mainPanel.setBackground(Color.red);
        add(mainPanel, BorderLayout.CENTER);

        controlPandel.setBackground(Color.GRAY);
        controlPandel.add(redButton);
        controlPandel.add(blueButton);
        controlPandel.add(greenButton);

        add(controlPandel, BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("My app");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
