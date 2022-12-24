package polyankina_kvbo0821.prac6.hw6_2;

import polyankina_kvbo0821.prac6.hw6_1.Movable;

public class MovableRectangle extends MovablePoint implements Movable {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int xSpeed;
    private int ySpeed;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    private void compareSpeed(int xSpeed, int ySpeed) {
        if (xSpeed == ySpeed) {
            System.out.println("Speeds are equal");
        }
        else {
            System.out.println("Speeds are not equal");
        }
    }

    public void moveUp() {

    }
    public void moveDown() {

    }
    public void moveLeft() {

    }
    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
