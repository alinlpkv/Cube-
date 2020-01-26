import java.awt.*;

import javax.swing.JFrame;

public class Main extends JFrame {

    public Main(){
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Кубик");
        Container pane = this.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;

        Cube c= new Cube();

     //   c.rotateCube(-45,-45,-45);
        Viewer v= new Viewer(c);

        MyPanel text= new MyPanel();
        constraints.weightx   = 0.05;
        constraints.weighty   = 0.02;
        constraints.gridx     = 2;
        constraints.gridy     = 0;
        add(text, constraints);


      //  v.setValueZ(Integer.parseInt(text.getText()));
        Degree d=new Degree();
        MyButtonDegree b = new MyButtonDegree(c, v, text,d);
        constraints.weightx   = 0.05;
        constraints.weighty   = 0.02;
        constraints.gridx     = 2;
        constraints.gridy     = 1;
        add(b, constraints);

        MyButtonDegree b1 = new MyButtonDegree(c, v, text,d);
        constraints.weightx   = 0.05;
        constraints.weighty   = 0.02;
        constraints.gridx     = 2;
        constraints.gridy     = 2;
        add(b1, constraints);

        MyButton button = new MyButton(c, v);
        constraints.weightx   = 0.4;
      //  constraints.weighty   = 0.05;
        constraints.gridx     = 0;
        constraints.gridy     = 0;
        constraints.gridheight =3;
        add(button, constraints);

        MyButton button1 = new MyButton(c,v);
        constraints.weightx   = 0.4;
      //  constraints.weighty   = 0.05;
        constraints.gridx     = 1;
        constraints.gridy     = 0;
        constraints.gridheight =3;
        add(button1, constraints);


       // constraints.weightx   = 0;
        constraints.weighty   = 0.7;
        constraints.gridx     = 0;
        constraints.gridy     = 3;
        constraints.gridwidth = 3;
        add(v, constraints);

        MyScroll scrollX = new MyScroll(Scrollbar.HORIZONTAL, 0, -360,360, c,v);
        //constraints.weightx   = 1;
        constraints.weighty   = 0.01;
        constraints.gridx     = 0;
        constraints.gridy     = 6;
        constraints.gridwidth= 3;
        constraints.gridheight =0;
        add(scrollX, constraints);

        MyScroll scrollY = new MyScroll(Scrollbar.VERTICAL, 0, -360,360, c,v);
        constraints.weightx   = 0.035;
        constraints.weighty   = 0.9;
        constraints.gridx     = 3;
        constraints.gridy     = 0;
        constraints.gridheight =6;
        add(scrollY, constraints);

        this.setVisible(true);
    }

    public static void  main(String[] args) { new Main();
    }

}

