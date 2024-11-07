import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GamePanel panel;
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(3);
        this.getContentPane().setBackground(Color.black);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
