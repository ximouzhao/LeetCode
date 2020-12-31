package programbase.seg6;

import java.awt.Frame;

import java.awt.*;

public class X extends Frame {
    public static void main(String[] args) {
        X x = new X();
        x.pack();
        x.setVisible(true);
    }
    public final void test(){

    }
    public X() {
        setLayout(new BorderLayout());
        Panel p = new Panel();
        add(p, BorderLayout.NORTH);
        Button b = new Button("North");
        p.add(b);
        Button b1 = new Button("South");
        add(b1, BorderLayout.SOUTH);
    }
}