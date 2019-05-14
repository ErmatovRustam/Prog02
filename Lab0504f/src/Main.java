import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JPanel mainPanel = new JPanel();
    JPanel controlpanel = new JPanel();
    JButton redButton = new JButton("RED");
    JButton greenButton = new JButton("GREEN");
    JButton blueButton = new JButton("BLUE");

    Main(){
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.setBackground(Color.RED);

        controlpanel.setBackground(Color.DARK_GRAY);
        controlpanel.add(redButton);
        controlpanel.add(blueButton);
        controlpanel.add(greenButton);
        add(controlpanel, BorderLayout.SOUTH);


        redButton.addActionListener(e ->  mainPanel.setBackground(Color.RED));
        greenButton.addActionListener(e-> mainPanel.setBackground( Color.GREEN));
        blueButton.addActionListener(e-> mainPanel.setBackground(Color.BLUE));


    }
    public static void main(String[] args) {

        Main fram = new Main();
        fram.setTitle("My");
        fram.setSize(400, 400);
        fram.setLocationRelativeTo(null);
        fram.setVisible(true);
        fram.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}

