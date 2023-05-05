package zad42;

public class Truck extends Car implements Purchase{
    protected int weight;
    public Truck(int speed, String color, int weight, double regularPrice){
        this.speed = speed;
        this.color = color;
        this.weight = weight;
        this.regularPrice = regularPrice;
    }

    public double getSalePreice() {
        if (weight > 2000)
        {
            return (regularPrice * 0.9);
        }
        else
        {
            return regularPrice;
        }
    }
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }

}
