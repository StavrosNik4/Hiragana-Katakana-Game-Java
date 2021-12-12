import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
    UI(){
        this.setTitle("My Parser");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(320,480);



        FlowLayout aLayout = new FlowLayout();
        setLayout(aLayout);
        //adds
        this.setVisible(true);
    }
}
