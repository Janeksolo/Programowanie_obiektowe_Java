package zad42;

public class Ford extends Car implements Purchase {
    protected int year;
    protected int manufactureDiscount;

    public Ford(int speed, String color, int year, int manufactureDiscount, double regularPrice){
        this.speed = speed;
        this.color = color;
        this. year = year;
        this.manufactureDiscount = manufactureDiscount;
        this.regularPrice = regularPrice;
    }


    public double getSalePreice() {
        return (regularPrice  - manufactureDiscount);
    }
    public String getPurchaseInfo() {
        return "FORD: ";
    }
}
