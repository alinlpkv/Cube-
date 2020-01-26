import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    private String str = "0";

    public MyPanel(){
        this.setBackground(Color.GREEN);
    }

    public void setStr(int degrees) {
        this.str = "" + degrees;
    }


    public void paintComponent(Graphics g){
        g = (Graphics2D) g;
        super.paintComponent(g);
        g.drawString(str, 20, 20);
    }

}
