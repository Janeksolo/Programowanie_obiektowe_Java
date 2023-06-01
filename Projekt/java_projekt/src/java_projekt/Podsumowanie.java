package java_projekt;

import java.util.List;

public class Podsumowanie {
    public static void wyswietlPodsumowanieZamowienia(List<Zamowienie> listaZamowien) {
        if (listaZamowien.isEmpty()) {
            System.out.println("Brak zamówień do wyświetlenia.");
            return;
        }

        System.out.println("Zamówienia:");

        for (int i = 0; i < listaZamowien.size(); i++) {
            System.out.println("Zamówienie " + (i + 1));
            listaZamowien.get(i).wyswietlZamowienie();
            System.out.println();
        }
    }
}
