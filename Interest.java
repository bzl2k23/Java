import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Interest extends JApplet implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public void init() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        l1 = new JLabel("Principal Amount:");
        l2 = new JLabel("Rate Of interest:");
        l3 = new JLabel("Years:");
        l4 = new JLabel("Interest:");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);
        t4.setEditable(false);

        b1 = new JButton("Calculate");

        c.add(l1);
        c.add(t1);
         c.add(new JSeparator()); 
        c.add(l2);
        c.add(t2);
         c.add(new JSeparator()); 
        c.add(l3);
        c.add(t3);
        c.add(new JSeparator()); // Add a line break
        c.add(l4);
        c.add(t4);
        c.add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String ac = ae.getActionCommand();

        if (ac.equals("Calculate")) {
            calculateInterest();
        }
    }

    private void calculateInterest() {
        try {
            double p = Double.parseDouble(t1.getText());
            double r = Double.parseDouble(t2.getText());
            double y = Double.parseDouble(t3.getText());

            double interest = (p * r * y) / 100;

            t4.setText(Double.toString(interest));
        } catch (NumberFormatException e) {}     
      }
    }

