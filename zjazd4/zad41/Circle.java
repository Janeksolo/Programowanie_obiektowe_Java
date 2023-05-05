package zad41;

public class Circle {
    protected double radius;
    protected String color;

    public Circle(){
        this.radius = 1;
        this.color = "blue";
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "blue";

    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (Math.PI * radius);

    }
    public String toString(){
        return "pole kola wynosi: "+ getArea() + " a kolor jest: "+ color;
    }

}
