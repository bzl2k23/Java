// Filename: CircleAreaCalculator.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleSwing extends JApplet implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;

    public void init() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        l1 = new JLabel("Radius:");
        l2 = new JLabel("Area:");

        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t2.setEditable(false);

        b1 = new JButton("Calculate");

        c.add(l1);
        c.add(t1);
        c.add(b1);
        c.add(new JSeparator());
        c.add(l2);
        c.add(t2);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            calculateArea();
        }
    }

    private void calculateArea() {
        try {
            double r = Double.parseDouble(t1.getText());
            double a = Math.PI * r * r;

            t2.setText(String.valueOf(a));  // Changed from String.format to String.valueOf
        } catch (Exception e) {
            // Handle exception if needed
        }
    }
}
