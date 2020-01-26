
import javax.swing.*;
import java.awt.*;

public class Viewer extends JPanel {
    private Cube c1;
    private int kButton=0;
    private int Xscroll=0;
    private int Yscroll=0;
    private int Ztext=0;

    public Viewer(Cube c){
        this.c1=c;
    }


    public void setkButton(int k){
        kButton=k;
    }

    public void setXsroll(int x){
        Xscroll=x;
    }

    public void setYsroll(int y){
        Yscroll=y;
    }

    public void setValueZ(int z){Ztext=z;}

    public void paint(Graphics g){
        Graphics2D g2d= (Graphics2D)g; //приведение типов
        g.translate(getWidth()/2, getHeight()/2);
        g.drawLine(0,-getHeight(),0,getHeight());
        g.drawLine(-getWidth(),0,getWidth(),0);
        Cube c = new Cube();
        c1 = c;
        c.scale(100);
        c.translate(-50,-50,-50);
        c.rotateCube(Yscroll,Xscroll,Ztext);
       if (kButton==1) c.draw(g2d);
       else if (kButton==2) c.perpdraw(g2d);
    }


}
