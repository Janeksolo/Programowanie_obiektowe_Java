package zad31;

public class Circle {
    private double radius;
    private String color;

    public void setPromien()
    {
        this.color = "Czerwony";
        this.radius = 7;
    }
    public void setPromien(double radius)
    {
        this.color = "Zielony";
        this.radius = radius;
    }
    public void setPromienc(double radius, String color)
    {
        this.color = color;
        this.radius = radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public String toString()
    {
        System.out.println("Circle: radius = "+radius+" color = "+color);
        return null;
    }

}
