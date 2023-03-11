import java.util.Scanner;

public class zadanie10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WEJŚCIE; ");
        System.out.println("Podaj ilość wierszy: ");
        int wiersze = scanner.nextInt();
        System.out.println("Podaj ilość kolumn: ");
        int kolumny = scanner.nextInt();

        int[][] macierz = new int[wiersze][kolumny];

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print("Podaj element [" + i + "][" + j + "]: ");
                macierz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("WYJŚCIE; ");
        for (int j = 0; j < kolumny; j++) {
            for (int i = 0; i < wiersze; i++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
