import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        int liczby1;
        double liczby2;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Wejście: ");
        System.out.println("Podaj ilość liczb: ");
        liczby1 = scanner1.nextInt();
        double []tablica = new double[liczby1];


        for(int i = 0;i < liczby1;i++ )
        {
            System.out.println("Podaj liczbe:" + (i + 1));
            liczby2 = scanner2.nextDouble();
            tablica[i] = liczby2;
        }
        System.out.println("Wyjście: ");
        System.out.println(maks(liczby1, tablica));
    }
    public static double maks(int liczba1,double tablica[]){
        if (liczba1 == 1) {
            return tablica[0];
        }
        double maksfunc = maks( liczba1 -1,tablica);
        return Math.max(maksfunc, tablica[liczba1 -1]);
    }
}
