package zad54;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<ksiazka> ksiazki = new ArrayList<>();
        Ebook ksiazka1 = new Ebook("Pan Tadeusz","Adam Mickiewicz",345,20,"pdf");
        KsiazkaPapierowa ksiazka2 = new KsiazkaPapierowa("Lalka","Bolesław Prus",459,1989);
        KsiazkaPapierowa ksiazka3 = new KsiazkaPapierowa("Zbrodnia i kara", "Fiodor Dostojewski",321,2018);
        Ebook ksiazka4 = new Ebook("Chłopi", "Reymont",467,34,"epub");

        ksiazki.add(ksiazka1);
        ksiazki.add(ksiazka2);
        ksiazki.add(ksiazka3);
        ksiazki.add(ksiazka4);


        ksiazki.sort(Comparator.comparing(ksiazka::getTytul));


        for (ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka.getTytul() + " - " + ksiazka.getAutor());
        }
    }
}
