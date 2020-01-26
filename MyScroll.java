import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class MyScroll extends JScrollBar {
    private Cube c;
    private  Viewer v;
    private static int num=0;
    private  int k;

    public MyScroll(int orientation, int value, int min, int max, Cube c, Viewer v){

        this.setOrientation(orientation);
        this.setValue(value);
        this.setMaximum(max);
        this.setMinimum(min);

        num++;
        k=num;
        System.out.println(num);
        System.out.println(k);
        if (k==1){
            MyScrollListener listener = new MyScrollListener();
            this.addAdjustmentListener(listener);
        }
        if (k==2){
            MyScrollListener1 listener1 = new MyScrollListener1();
            this.addAdjustmentListener(listener1);
        }

        this.c = c;
        this.v = v;
    }


    private class MyScrollListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e){
            v.setXsroll(e.getValue());
            v.setVisible(false);
            v.updateUI();
            v.setVisible(true);
        }
    }

    private class MyScrollListener1 implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e){
            v.setYsroll(e.getValue());
            v.setVisible(false);
            v.updateUI();
            v.setVisible(true);
        }
    }





}
