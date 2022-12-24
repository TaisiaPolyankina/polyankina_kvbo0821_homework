package polyankina_kvbo0821.prac2.hw2_ex6;

public class CircleSix {
    private double x;
    private double y;
    private double r;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double Area(double r) {
        return r * Math.PI * r;
    }

    public double Length(double r) {
        return 2 * r * Math.PI;
    }

    public CircleSix(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return "CircleSix{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
