import java.util.Scanner;
import java.text.DecimalFormat;

public class zadanie12 {
    public static void main(String[] args) {
        double sekundyrokziemia = 31557600;
        double sekundy;
        double wynik;
        double wynikkoncowy;
        double wynikkoncowy2;
        String planeta;
        System.out.println("WEJŚCIE");
        System.out.println("podaj sekundy");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        sekundy = scanner1.nextDouble();
        System.out.println("podaj nazwe planety");
       // planeta = String.valueOf(scanner2.hasNextLine());
        planeta = scanner2.nextLine();
        wynik =  sekundy / sekundyrokziemia;
        wynikkoncowy = wyborplanety(planeta);
        if (wynikkoncowy == 101)
        {
            System.out.println("podaj poprawna nazwe planety");
        }
        else
        {
            DecimalFormat df = new DecimalFormat("0.00");
            wynikkoncowy2 = wynik * wynikkoncowy;
            String formattedNumber = df.format(wynikkoncowy2);
            System.out.println("WYJSCIE: ");
            System.out.println(formattedNumber);
        }
    }
    public static double wyborplanety(String planeta) {
        String planeta2 = planeta;
        if (planeta2 == "merkury") {
            return 0.2408467;
        } else if (planeta2.equalsIgnoreCase("wenus")) {
            return 0.61519726;
        } else if (planeta2.equalsIgnoreCase("ziemia")) {
            return 1;
        } else if (planeta2.equalsIgnoreCase("mars")) {
            return 1.8808158;
        } else if (planeta2.equalsIgnoreCase("jowisz")) {
            return 11.862615;
        } else if (planeta2.equalsIgnoreCase("saturn")) {
            return 29.447498;
        } else if (planeta2.equalsIgnoreCase("uran")) {
            return 84.016846;
        } else if (planeta2.equalsIgnoreCase("neptun")) {
            return 164.79132;
        } else {
            return 101;
        }
    }
}
