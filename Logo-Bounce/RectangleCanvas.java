import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleCanvas extends JComponent {
    
    private MyRectangle r1, r2;
    private int width, height;
    
    public RectangleCanvas(int w, int h) {
        this.width = w;
        this.height = h;
        this.r1 = new MyRectangle((width/2) - 50,1, 50, 50, 5, 5);
        this.r2 = new MyRectangle(width-76, (height/2)-25, 75, 50, 5, 5);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        r1.draw(g);
        g.setColor(Color.GREEN);
        r2.draw(g);
    }
    
    public void startAnimation() {
        Timer timer = new Timer(20, new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent ae) {
                MyRectangle r = r1;
                for (int i = 0; i < 2 ; i++) {
                    if (i == 0) {
                        r = r1;
                    } else if (i == 1) {
                        r = r2;
                    }
                    boolean ic = r1.isColliding(r2);
                    if (ic) {
                        r.changeHDir(-1);
                        r.changeVDir(-1);
                    } else {
                        if (r.getX() + r.getW() >= width || r.getX()<0) {
                            r.changeHDir(-1);
                        }
                        if (r.getY() + r.getH() >= height || r.getY() <= 0) {
                            r.changeVDir(-1);
                        }
                    }
                    r.moveD();
                }
                repaint();
            }
        });
        timer.start();
    }
}