package zad31;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setPromien();
        circle1.getRadius();
        circle1.getArea();
        System.out.println("The circle c1 has radius of "+circle1.getRadius()+" and are of "+circle1.getArea());
        circle1.toString();

        Circle circle2 = new Circle();
        circle2.setPromien(12);
        circle2.getRadius();
        circle2.getArea();
        System.out.println("The circle c2 has radius of "+circle2.getRadius()+" and are of "+circle2.getArea());
        circle2.toString();

        Circle circle3 = new Circle();
        circle3.setPromienc(9, "Niebieski");
        circle3.getRadius();
        circle3.getArea();
        System.out.println("The circle c3 has radius of "+circle3.getRadius()+" and are of "+circle3.getArea());
        circle3.toString();

        Circle circle4 = new Circle();
        circle4.setPromien(17);
        circle4.setColor("Różowy");
        circle4.getRadius();
        circle4.getArea();
        System.out.println("The circle c4 has radius of "+circle4.getRadius()+" and are of "+circle4.getArea());
        circle4.toString();



    }

}
