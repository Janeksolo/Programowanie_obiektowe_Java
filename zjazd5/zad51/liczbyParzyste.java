package zad51;

import java.util.ArrayList;
public class liczbyParzyste {
    public static void main(String[] args) {
        long startczasu = System.nanoTime();

        ArrayList<Integer> listaLiczbParzystych = new ArrayList<Integer>();

        for (int i = 2; listaLiczbParzystych.size() < 50; i += 2) {
            listaLiczbParzystych.add(i);
        }

        for (int i = 0; i < listaLiczbParzystych.size(); i++) {
            System.out.println("Indeks: [" + i + "], wartość: " + listaLiczbParzystych.get(i));
        }

        long koniecczasu = System.nanoTime();
        long czasTrwania = koniecczasu - startczasu;
        System.out.println("Czas wykonania programu: " + czasTrwania + " ns");
    }


}
