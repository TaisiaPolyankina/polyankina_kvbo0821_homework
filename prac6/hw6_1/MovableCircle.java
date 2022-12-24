package polyankina_kvbo0821.prac6.hw6_1;

public class MovableCircle extends MovablePoint implements Movable {

    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp() {
        super.moveUp();
    }
    public void moveDown() {
        super.moveDown();
    }
    public void moveLeft() {
        super.moveLeft();
    }
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                '}';
    }
}
