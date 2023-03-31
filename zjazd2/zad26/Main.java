package zad26;

public class Main {
    public static void main(String[] args)
    {
        Dane dane = new Dane();
        dane.funcwyswprzed(dane.tablica);
        System.out.println();
        dane.transpozycja();
        dane.funcwyswprzed(dane.tablica2);
    }
}
