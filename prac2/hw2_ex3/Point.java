package polyankina_kvbo0821.prac2.hw2_ex3;

public class Point {
    protected double x0;
    protected double y0;

    public void setY(double y) {
        this.y0 = y;
    }
    public double getY() {
        return y0;
    }

    public void setX(double x) {
        this.x0 = x;
    }
    public double getX() {
        return x0;
    }

    public Point(double x, double y) {
        this.x0 = x;
        this.y0 = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x0=" + x0 +
                ", y0=" + y0 +
                '}';
    }
}
