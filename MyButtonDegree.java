import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonDegree extends JButton {
    private MyPanel t;
    private Cube c;
    private Viewer v;
    private Degree d;
    private static int num=0;
    private  int k;


    public MyButtonDegree(Cube c, Viewer v, MyPanel t, Degree d) {
        num++;
        k=num;

        if (k==1){
        MyButtonDegreeListener listener = new MyButtonDegreeListener();
        this.addActionListener(listener);
        this.setText("Z + 15");
        }
        if (k==2) {
            MyButtonDegreeListener2 listener2 = new MyButtonDegreeListener2();
            this.addActionListener(listener2);
            this.setText("Z - 15");
        }
        this.c = c;
        this.v = v;
        this.t = t;
        this.d=d;

    }

    private class MyButtonDegreeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            d.increment();
            t.setStr(d.getDegree());
            t.repaint();
            v.setValueZ(d.getDegree());
            v.setVisible(false);
            v.updateUI();
            v.setVisible(true);
        }
    }

    private class MyButtonDegreeListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            d.minus();
            t.setStr(d.getDegree());
            t.repaint();
            v.setValueZ(d.getDegree());
            v.setVisible(false);
            v.updateUI();
            v.setVisible(true);
        }
    }
}