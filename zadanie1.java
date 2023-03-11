import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        double first, second;

        System.out.println("> WEJŚCIE:");
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextDouble();
        second = scanner.nextDouble();

        double suma = first + second;

        System.out.println("WYJŚCIE:");
        System.out.println(suma);

    }
}
