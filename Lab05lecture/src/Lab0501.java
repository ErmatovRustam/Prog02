import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class Lab0501 extends JFrame {
    JPanel mainPanel;
    JPanel controlPanel;
    JButton redButton;
    JButton blueButton;
    JButton greenButton;

    public Lab0501() {
        setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.GREEN);
        add(mainPanel, BorderLayout.CENTER);

        controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);
        add(controlPanel, BorderLayout.SOUTH);

        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        greenButton = new JButton("Green");

        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);

        redButton.addActionListener(new RedButtonListener());
    }

    public static void main(String[] args) {

        Lab0501 frame = new Lab0501();
        frame.setTitle("First swing app");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    class RedButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainPanel.setBackground(Color.RED);
        }


    }
}