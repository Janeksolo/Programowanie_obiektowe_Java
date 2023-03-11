import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args){
        int a;
        int b;

        System.out.println("Podaj długość wektora 1; ");
        Scanner scanner1 = new Scanner(System.in);
        a = scanner1.nextInt();

        System.out.println("Podaj długość wektora 2; ");
        Scanner scanner2 = new Scanner(System.in);
        b = scanner2.nextInt();

        if (a != b)
        {
            System.out.println("błąd");
        }
        else
        {
            double[] tablica1 = new double[a];
            double[] tablica2 = new double[b];

            dodaj(a, tablica1);
            dodaj(b, tablica2);

            double rezultat = wynik(tablica1, tablica2, a);

            System.out.println("Wyjście: ");
            System.out.print(rezultat);
        }
    }
    public static void dodaj(int liczba, double tablica[])
    {
        double a;
        for(int i = 0; i < liczba; i++){
            System.out.println("Podaj liczbe: ");
            Scanner scanner1 = new Scanner(System.in);
             a = scanner1.nextDouble();
             tablica[i] = a;
        }

    }
    public static double wynik(double tablica1[], double tablica2[], int liczba)
    {
        double rezultat = 0;
        for (int i = 0; i < liczba; i++){
            rezultat += tablica1[i] * tablica2[i];
        }
        return rezultat;
    }
}