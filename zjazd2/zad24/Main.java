package zad24;


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Dane dane = new Dane();
        Scanner scanner = new Scanner(System.in);

        System.out.print("str1:");
        dane.napis1 = scanner.nextLine();
        System.out.println();

        System.out.print("str2:");
        dane.napis2 = scanner.nextLine();
        System.out.println();
        System.out.println();

        System.out.println("str1 == str2:");
        System.out.println(dane.Czytakisam());
        System.out.println();

        System.out.println("str1.equels(str2): " + dane.Czytakisam());
    }
}
