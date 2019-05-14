import javafx.scene.layout.Background;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    CanvasPanel canvasPanel = new CanvasPanel();
    JPanel controlPanel = new JPanel();

    JButton rect = new JButton("RECT");

    Main() {
        setLayout(new BorderLayout());
        canvasPanel.setBackground(Color.WHITE);
        canvasPanel.setFocusable(true);

        controlPanel.setBackground(Color.DARK_GRAY);
controlPanel.add(rect);
        add(canvasPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        rect.addActionListener(new ButtonListener(this));
    }


    public static void main(String[] args) {

        Main frame = new Main();
        frame.setTitle("Figure: ");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

}

class CanvasPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 100, 100);
    }

    //public void fillRect(int i, int i1, int i2, int i3) {

   //     fillRect(i, i1, i2, i3);
  //  }
}
class ButtonListener implements ActionListener{
        Main main;
        Rect rect;
    public ButtonListener(Main main){
        this.main = main;
       // this.rect = rect;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//main.canvasPanel.fillRect(100, 100, 50, 50);
    }
}


