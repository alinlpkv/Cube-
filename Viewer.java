import javax.swing.*;
import java.awt.*;

public class Viewer extends JFrame {
    public static int width=1000;
    public static int height=1000;
    private Cube c1;

    public Viewer(Cube c){
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Кубик");
        this.c1=c;
    }

    public void paint(Graphics g){
        Graphics2D g2d= (Graphics2D)g; //приведение типов
        g.translate(getWidth()/2, getHeight()/2);
        g.drawLine(0,-getHeight(),0,getHeight());
        g.drawLine(-getWidth(),0,getWidth(),0);
       // c1.draw(g2d);
        c1.perpdraw(g2d);
    }



}
