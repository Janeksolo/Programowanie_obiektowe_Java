import java.util.Scanner;

//zadanie 8
public class zadanie8 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WEJŚCIE: ");
        a = scanner.nextInt();
        System.out.println("WYJŚCIE: ");
        Piramida1(a);
        Piramida2(a);


    }
    public static void Piramida1(int a) {
        for (int i = 1; i <= a; i++) {
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = a; i >= 1; i--) {
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Piramida2(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        ;

    }
}

