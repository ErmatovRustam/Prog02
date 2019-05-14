import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    CanvasPanel canvasPanel = new CanvasPanel();

    Main() {
        add(canvasPanel);
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Chess");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

    }


    class CanvasPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int dw = getWidth() / 8;
            int dh = getHeight() / 8;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    Color c;

                    if (i % 2 == 0) {
                        if (j % 2 != 0) {
                            c = Color.WHITE;
                        } else {
                            c = Color.BLACK;
                        }
                    } else {
                        if (j % 2 != 0) {
                            c = Color.BLACK;
                        } else {
                            c = Color.WHITE;
                        }
                    }
                    g.setColor(c);
                    g.fillRect(dw * j, dh * i, dw, dh);
                }
            }

        }

    }
}