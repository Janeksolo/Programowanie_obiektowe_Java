package zad52;

public class MovablePoint implements Moveble {
    protected int x;
    protected int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "punkt x = " + x + ", punkt y = " + y;
    }

    public void MoveUp(){
        System.out.println("Przesunieto do góry");
    }
    public void MoveDown(){
        System.out.println("Przesunieto do dołu");
    }
    public void MoveLeft(){
        System.out.println("Przesunieto w lewo");
    }
    public void MoveRight(){
        System.out.println("Przesunieto w Prawo");
    }
}
