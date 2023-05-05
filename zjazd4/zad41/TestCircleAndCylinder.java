package zad41;

public class TestCircleAndCylinder {

    public static void main(String args[]) {
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(5.0);
        System.out.println(circle2.toString());

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(7);
        System.out.println(cylinder2.toString());

        Cylinder cylinder3 = new Cylinder(7,5);
        System.out.println(cylinder3.toString());

    }
}
