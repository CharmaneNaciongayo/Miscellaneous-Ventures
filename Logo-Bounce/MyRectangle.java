import java.awt.*;

public class MyRectangle {
    
    private int x, y, w, h, hs, vs;
    
    public MyRectangle(int a, int b, int c, int d, int e, int f) {
        this.x = a;
        this.y = b;
        this.w = c;
        this.h = d;
        this.vs = e;
        this.hs = f;
    }
    
    public void draw(Graphics g) {
        g.fillRect(x, y, w, h);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getW() {
        return w;
    }
    
    public int getH() {
        return h;
    }
    
    public void moveD() {
        this.x += hs;
        this.y += vs;
    }

    public void changeHDir(int c) {
        this.hs *= c;
    }

    public void changeVDir(int c) {
        this.vs *= c;
    }

    public boolean isColliding(MyRectangle r2) {
        return !(
        this.x + this.w <= r2.getX() ||
        this.x >= r2.getX() + r2.getW() ||
        this.y + this.h <= r2.getY() ||
        this.y >= r2.getY() + r2.getH()
        );
    }
}