package zad29;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dane dane = new Dane();
        System.out.println("Pomyślałem litere z przedziału od A do Z.");
        System.out.print("Odgadnij ją: ");
        dane.znakpokonwersji = System.in.read();
        dane.znak = (char) dane.znakpokonwersji;
        int wartoscM = dane.pozycjalitrey(dane.litera);
        int wartoscZ = dane.pozycjalitrey(dane.znak);
        dane.czytrafiles(wartoscZ,wartoscM);
    }
}
