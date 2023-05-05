package zad42;

public class Sedan extends Car implements Purchase {
    protected int lenght;

    public Sedan(int speed, String color, int lenght, double regularPrice){
        this.speed = speed;
        this.color = color;
        this.lenght = lenght;
        this.regularPrice = regularPrice;
    }

    public double getSalePreice() {
        if (lenght > 20) {
            return (regularPrice * 0.95);
        } else {
            return (regularPrice * 0.9);
        }

    }
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }
}
