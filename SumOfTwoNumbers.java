import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SumOfTwoNumbers extends JApplet implements ActionListener {
    JButton b1;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    int num1, num2, sum;

    public void init() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        l1 = new JLabel("Enter the First Number:");
        t1 = new JTextField(20);
        
        l2 = new JLabel("Enter the Second Number:");
        t2 = new JTextField(20);
        
        l3 = new JLabel("Sum:");
        t3 = new JTextField(20);
        

        b1 = new JButton("Calculate Sum");

        contentPane.add(l1);
        contentPane.add(t1);
        contentPane.add(l2);
        contentPane.add(t2);
        contentPane.add(l3);
        contentPane.add(t3);
        contentPane.add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        num1 = Integer.parseInt(t1.getText());
        num2 = Integer.parseInt(t2.getText());

        if (str.equals("Calculate Sum")) {
            sum = num1 + num2;
        }

        t3.setText(String.valueOf(sum));
        repaint();
    }
}
