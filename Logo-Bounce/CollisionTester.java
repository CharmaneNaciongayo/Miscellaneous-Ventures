import javax.swing.*;
import java.awt.*;

public class CollisionTester {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		int w = 800;
		int h = 600;
		RectangleCanvas dc = new RectangleCanvas(w, h);
		dc.setPreferredSize(new Dimension(w,h));
		dc.startAnimation();
		jf.add(dc);
		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setTitle("Collision Detection");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}