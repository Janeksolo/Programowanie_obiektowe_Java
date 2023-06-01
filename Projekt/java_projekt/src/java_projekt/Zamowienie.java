package java_projekt;

import java.util.ArrayList;
import java.util.List;

class Zamowienie {
    private List<Pizza> zamowionePizze;
    private boolean dostawa;
    private String adresDostawy;
    private String punktOdbioru;

    public Zamowienie() {
        zamowionePizze = new ArrayList<>();
        dostawa = false;
        adresDostawy = "";
        punktOdbioru = "";
    }

    public void dodajPizza(Pizza pizza) {
        zamowionePizze.add(pizza);
    }

    public void ustawDostawe(String adres) {
        dostawa = true;
        adresDostawy = adres;
    }

    public void ustawOdbiorOsobisty(String punktOdbioru) {
        dostawa = false;
        this.punktOdbioru = punktOdbioru;
    }

    public double obliczCalkowitaCene() {
        double suma = 0;
        for (Pizza pizza : zamowionePizze) {
            suma += pizza.getCena();
        }
        if (dostawa) {
            suma += 5.0; // Opłata za dostawę
        }
        return suma;
    }

    public void wyswietlZamowienie() {
        System.out.println("Zamówione pizze:");
        for (Pizza pizza : zamowionePizze) {
            System.out.println("- " + pizza.getNazwa() + " (" + pizza.getCena() + " zł)");
        }
        System.out.println("Całkowita cena: " + obliczCalkowitaCene() + " zł");

        if (dostawa) {
            System.out.println("Dostawa pod adres: " + adresDostawy);
        } else {
            System.out.println("Odbiór osobisty w punkcie: " + punktOdbioru);
        }
    }


}
