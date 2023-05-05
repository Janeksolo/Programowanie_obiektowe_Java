package zad42;

public class AutoShop {
    public static void main(String args[]) {
        Sedan sedan = new Sedan(156, "red", 10, 20000);


        System.out.println("Sedan: ");
        System.out.println("- speed = "+ sedan.speed);
        System.out.println("- regularPrice = "+ sedan.regularPrice);
        System.out.println("- color = "+ sedan.color);
        System.out.println("- length = "+ sedan.lenght);

        Ford ford1 = new Ford(156, "black", 2005, 10, 4452);

        System.out.println("Ford 1:");
        System.out.println("- speed = "+ ford1.speed);
        System.out.println("- regularPrice = "+ ford1.regularPrice);
        System.out.println("- color = "+ ford1.color);
        System.out.println("- year = "+ ford1.year);
        System.out.println("- manufacturerDiscount = "+ford1.manufactureDiscount);

        Ford ford2 = new Ford(155,"pink", 1998, 5, 5000);

        System.out.println("Ford 2:");
        System.out.println("- speed = "+ ford2.speed);
        System.out.println("- regularPrice = "+ ford2.regularPrice);
        System.out.println("- color = "+ ford2.color);
        System.out.println("- year = "+ ford2.year);
        System.out.println("- manufacturerDiscount = "+ford2.manufactureDiscount);

        Truck truck = new Truck(140, "blue", 2100, 10000);

        System.out.println("Truck:");
        System.out.println("- speed = "+ truck.speed);
        System.out.println("- regularPrice = "+ truck.regularPrice);
        System.out.println("- color = "+ truck.color);
        System.out.println("- weight = "+ truck.weight);

        System.out.println(sedan.getPurchaseInfo() + " " + sedan.getSalePreice());
        System.out.println(ford1.getPurchaseInfo() + " " + ford1.getSalePreice());
        System.out.println(ford2.getPurchaseInfo() + " " + ford2.getSalePreice());
        System.out.println(truck.getPurchaseInfo() + " " + truck.getSalePreice());




    }
}
