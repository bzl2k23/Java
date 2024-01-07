import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Flag extends Applet {
    
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.white);
        
        // Draw the flag components
        drawFlag(g);
    }
    
    public void drawFlag(Graphics g) {
        
        // Draw the stripes (adjust the colors and positions as needed)
        g.setColor(Color.green);
        g.fillRect(50, 50, 300, 40);

        g.setColor(Color.white);
        g.fillRect(50, 90, 300, 40);

        g.setColor(Color.orange);
        g.fillRect(50, 130, 300, 40);

        // Draw the national emblem (customize as needed)
        int circleX = 225;
        int circleY = 120;
        int circleDiameter = 50;

        g.setColor(Color.blue);
        g.fillOval(circleX - circleDiameter / 2, circleY - circleDiameter / 2, circleDiameter, circleDiameter);
        
        
    }
}
