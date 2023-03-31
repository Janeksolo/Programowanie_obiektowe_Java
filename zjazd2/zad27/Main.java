package zad27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dane dane = new Dane();
        System.out.println("Podaj promień walac:");
        dane.promienwalca = scanner.nextFloat();
        System.out.println("Podaj wysokość walac:");
        dane.wysokoscwalca = scanner.nextFloat();
        System.out.println("Pojemność walca wynosi "+ dane.obliczwynik());
    }
}
