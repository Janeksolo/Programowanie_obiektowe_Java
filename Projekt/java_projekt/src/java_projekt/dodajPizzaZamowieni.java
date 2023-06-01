package java_projekt;

import java.util.List;
import java.util.Scanner;

public class dodajPizzaZamowieni {
    public static void dodajPizzeDoZamowienia(List<Pizza> listaPizz, List<Zamowienie> listaZamowien) {
        if (listaPizz.isEmpty()) {
            System.out.println("Menu jest puste. Najpierw dodaj pizzę do menu.");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        Zamowienie zamowienie = new Zamowienie();

        System.out.println("Dostępne rodzaje pizzy:");
        for (int i = 0; i < listaPizz.size(); i++) {
            System.out.println((i + 1) + ". " + listaPizz.get(i).getNazwa());
        }

        System.out.print("Wybierz numer pizzy: ");
        int numerPizza = scanner.nextInt();
        scanner.nextLine();

        if (numerPizza < 1 || numerPizza > listaPizz.size()) {
            System.out.println("Nieprawidłowy numer pizzy!");
            return;
        }

        Pizza wybranaPizza = listaPizz.get(numerPizza - 1);

        double cena = 0;
        System.out.print("Podaj rozmiar (mała, średnia, duża): ");


        String rozmiar = scanner.nextLine();

        switch (rozmiar) {
            case "mała":
                cena = wybranaPizza.getCena();
                break;
            case "średnia":
                cena = wybranaPizza.getCena() + 5.0;
                break;
            case "duża":
                cena = wybranaPizza.getCena() + 10.0;
                break;
            default:
                System.out.println("Nieprawidłowy rozmiar!");
                return;
        }

        wybranaPizza = new Pizza(wybranaPizza.getNazwa(),
                wybranaPizza.getSkladniki(),
                wybranaPizza.getOstrosc(),
                cena);

        zamowienie.dodajPizza(wybranaPizza);

        // Wybór opcji dostawy lub odbioru osobistego
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dostawa");
        System.out.println("2. Odbiór osobisty");

        System.out.print("Wybierz numer opcji: ");
        int numerOpcji = scanner.nextInt();
        scanner.nextLine();

        switch (numerOpcji) {
            case 1:
                System.out.print("Podaj adres dostawy: ");
                String adresDostawy = scanner.nextLine();
                zamowienie.ustawDostawe(adresDostawy);
                break;
            case 2:
                System.out.print("Podaj punkt odbioru: ");
                String punktOdbioru = scanner.nextLine();
                zamowienie.ustawOdbiorOsobisty(punktOdbioru);
                break;
            default:
                System.out.println("Nieprawidłowy numer opcji!");
                return;
        }

        listaZamowien.add(zamowienie);
        System.out.println("Dodano pizzę do zamówienia.");
    }

}
