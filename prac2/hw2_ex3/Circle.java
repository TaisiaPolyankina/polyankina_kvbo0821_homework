package polyankina_kvbo0821.prac2.hw2_ex3;

import polyankina_kvbo0821.prac2.hw2_ex3.Point;

public class Circle {
    private double r;

    Point p = new Point(0, 0);
    public Circle(double x, double y, double r) {
        p.setX(x);
        p.setY(y);
        this.r = r;
    }

    public void setX_centre(double x_centre) {
        p.setX(x_centre);
    }
    public double getX_centre() {
        return p.getX();
    }

    public void setY_centre(double y_centre) {
        p.setY(y_centre);
    }
    public double getY_centre() {
        return p.getY();
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }



    public void SetCentre(double x_centre, double y_centre) {
        p.setX(x_centre);
        p.setY(y_centre);
        System.out.println("Новое положение центра" + "\nпо x: " + p.getX() + "\n по y: " + p.getY());
    }


    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                "} " + p.toString();
    }
}
