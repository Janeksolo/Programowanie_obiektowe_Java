package java_projekt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class dodajPizza {
    public static void dodajNowaPizza(List<Pizza> listaPizz) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pizzy: ");
        String nazwa = scanner.nextLine();

        System.out.print("Podaj składniki (oddzielone przecinkami): ");
        String skladnikiInput = scanner.nextLine();
        List<String> skladniki = Arrays.asList(skladnikiInput.split(","));

        System.out.print("Podaj ostrość (0-3): ");
        int ostrosc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj cenę: ");
        double cena = scanner.nextDouble();
        scanner.nextLine();

        Pizza nowaPizza = new Pizza(nazwa, skladniki, ostrosc, cena);
        listaPizz.add(nowaPizza);

        System.out.println("Dodano nową pizzę do menu.");
    }
}
