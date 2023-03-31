package zad22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dane dane = new Dane();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Podaj imię:");
        dane.imie = scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        dane.nazwisko = scanner.nextLine();

        System.out.println("Podaj grupę:");
        dane.grupa = scanner.nextInt();

        System.out.println("Podaj kierunek:");
        dane.kierunek = scanner2.nextLine();

        dane.printFunc();
    }
}