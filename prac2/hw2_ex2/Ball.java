package polyankina_kvbo0821.prac2.hw2_ex2;

public class Ball {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void move(double xDisp, double yDisp) {
        System.out.println("Старое положение мяча: " + x + ' ' + y);
        setXY(xDisp, yDisp);
        System.out.println("Новое положение мяча: " + x + ' ' + y);
    }
}
