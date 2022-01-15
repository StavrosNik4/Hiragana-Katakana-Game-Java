import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
    JPanel panel;
    JTextField field;
    JButton button;
    UI(){
        this.setTitle("Hiragana Katakana Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(320,480);
        this.getContentPane().setBackground(Color.magenta);
        this.setLayout(null);

        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        int x = (d.width-getWidth())/2;
        int y = (d.height-getHeight())/2;
        setLocation(x, y);


        panel = new JPanel();
        panel.setBounds(100, 100, 100, 100);
        panel.setBackground(Color.WHITE);


        field = new JTextField();
        field.setBounds(100, 225, 100, 30);


        button = new JButton("Enter!");
        button.setBounds(100, 300, 100, 30);

        //adds
        this.add(panel);
        this.add(field);
        this.add(button);
        this.setVisible(true);
    }
}
