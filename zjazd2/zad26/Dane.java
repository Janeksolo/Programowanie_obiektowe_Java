package zad26;

public class Dane
{
    public int[][] tablica = {{0, 10, 20}, {1, 11, 21}, {2, 12, 21}};
    int[][] tablica2 = new int[tablica.length][tablica[0].length];

    void funcwyswprzed(int [][]tablica) {
        int max = 0;

        int maxdlugosc = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                int dlugosc = Integer.toString(tablica[i][j]).length();
                if (dlugosc > maxdlugosc) {
                    maxdlugosc = dlugosc;
                }
            }
        }


        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                String element = Integer.toString(tablica[i][j]);
                int brakujceZnaki = maxdlugosc - element.length();
                System.out.print(element);
                for (int k = 0; k < brakujceZnaki; k++) {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }

    }
    void transpozycja()
    {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica2[j][i] = tablica[i][j];
            }
        }
    }
}
