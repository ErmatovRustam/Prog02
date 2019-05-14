import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Main extends JFrame {
    JPanel panel = new JPanel();

    Main() {
        panel.setBackground(Color.DARK_GRAY);
        add(panel);
        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                setTitle(e.getX() + "; " + e.getY());
            }
        });

    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Mouse");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }


}
