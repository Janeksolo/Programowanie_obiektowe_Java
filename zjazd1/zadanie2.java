
import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {

        System.out.println("podaj liczbe ");
        double pierw, wynik;

        Scanner scanner = new Scanner(System.in);

        pierw = scanner.nextDouble();
        wynik = Math.sqrt(pierw);

        System.out.println("pierwiastek zaokrąglony do 2 miejsc po przecinku " + String.format("%.2f",wynik ));
    }
}
