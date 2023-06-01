package java_projekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pizza> listaPizz = new ArrayList<>();
        List<Zamowienie> listaZamowien = new ArrayList<>();

        int opcja;
        do {
            System.out.println("1. Dodaj pizzę do menu");
            System.out.println("2. Dodaj pizzę do zamówienia");
            System.out.println("3. Podsumowanie zamówienia");
            System.out.println("0. Wyjdź");

            opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1:
                    dodajPizza.dodajNowaPizza(listaPizz);
                    break;
                case 2:
                    Pizza wegetarianska = new Pizza("Wegetariańska",
                            List.of("szpinak", "pomidor", "sos", "ser"), 0, 25.0);
                    Pizza capriciosa = new Pizza("Capriciosa",
                            List.of("pieczarki", "szynka", "sos", "ser"), 1, 28.0);
                    Pizza pepperoni = new Pizza("Pepperoni",
                            List.of("salami", "papryka", "sos", "ser"), 2, 30.0);

                    listaPizz.add(wegetarianska);
                    listaPizz.add(capriciosa);
                    listaPizz.add(pepperoni);

                    dodajPizzaZamowieni.dodajPizzeDoZamowienia(listaPizz, listaZamowien);
                    break;
                case 3:
                    Podsumowanie.wyswietlPodsumowanieZamowienia(listaZamowien);
                    break;
                case 0:
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja!");
                    break;
            }
        } while (opcja != 0);
    }
}