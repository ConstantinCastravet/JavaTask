package oop.points;

public class Point {
    private int x = 1;
    private int y = 1;
    private int z = 1;


    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point(int x, int y, int z) {
        this(x, y);
        setZ(z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
