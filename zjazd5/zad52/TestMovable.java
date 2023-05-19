package zad52;

public class TestMovable {
    public static void main(String[] args) {
        Moveble Move1 = new MovablePoint(2, 5);
        System.out.println(Move1.toString());
        Move1.MoveRight();
        Move1.MoveLeft();
        Move1.MoveUp();
        Move1.MoveDown();
    }

}