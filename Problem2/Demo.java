package Problem2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint mPoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Before move: " + mPoint);
        mPoint.move();
        System.out.println("After move: " + mPoint);
    }
}
