
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        String tekst1, tekst2, tekstcaly;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        tekstcaly = scanner.nextLine();

        String[] TABLICA = tekstcaly.split(" ");

        System.out.println("%" + TABLICA[1] + " " + TABLICA[0] +"%");
    }
}
