import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PrimeSwings extends JApplet implements ActionListener {
    JButton b1;
    JLabel l1, l2;
    JTextField t1, t2;
    int num;

    public void init() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        l1 = new JLabel("Enter a number");
        t1 = new JTextField(20);
        l2 = new JLabel("Result");
        t2 = new JTextField(20);
        b1 = new JButton("Check Prime");
        contentPane.add(l1);
        contentPane.add(t1);
        contentPane.add(l2);
        contentPane.add(t2);
        contentPane.add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        num = Integer.parseInt(t1.getText());

        if (str.equals("Check Prime")) {
            int flag = 0;
            int k = (int) Math.sqrt(num);

            // Check for factors from 2 to sqrt(num)
            for (int j = 2; j <= k; j++) {
                if (num % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                t2.setText(num + " is prime");
            else
                t2.setText(num + " is not prime");
        }
        repaint();
    }
}
