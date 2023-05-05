package zad41;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder(){
        this.radius = 1;
        this.height =4;
        this.color = "blue";
    }
    public Cylinder(double radius) {
        this.radius = radius;
        this.height =4;
        this.color = "blue";


    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.color = "blue";
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }

    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height + 2 * super.getArea();
    }

    public String toString(){
        return "pole Cylindra wynosi: "+ getArea() + "a objetosc wynosi: "+ getVolume() + " a kolr wynosi " + color;
    }

}
