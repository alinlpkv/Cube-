import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.Icon;

public class MyButton extends JButton {
    private Cube c;
    private  Viewer v;
    private static int num=0;
    private  int k;

    public MyButton(Cube c, Viewer v){
        this.setBackground(Color.white);
       // Icon leftIcon = UIManager.getIcon("OptionPane.errorIcon");
        this.setIcon(new ImageIcon("D://Ява//Cube/im.png"));
        num++;
        k=num;
        System.out.println(num);
        System.out.println(k);

        if (k==1){
            MyButtonListener listener = new MyButtonListener();
            this.addActionListener(listener);
            this.setText(" Нарисовать");

        }
        if (k==2){
            MyButtonListener2 listener2 = new MyButtonListener2();
            this.addActionListener(listener2);
            this.setText(" Нарисовать в перспективе");
        }

        this.c = c;
        this.v = v;
    }


  /* public void update(Observable o, Object arg) {
       // degrees = (Degrees) o;
        t.setStr(degrees.getDegrees());
        t.repaint();
    }*/



    private class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            v.setkButton(1);
            v.setVisible(false);
            v.updateUI();
            v.setVisible(true);
        }
    }

    private class MyButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            v.setkButton(2);
            v.setVisible(false);
            v.updateUI();
            v.setVisible(true);
        }
    }
}
