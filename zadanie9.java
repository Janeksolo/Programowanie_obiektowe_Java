import java.util.Scanner;
public class zadanie9 {
    public static void main(String[] args) {
        String slowo;
        int slowolengh;
        boolean taknie;

        Scanner scanner = new Scanner(System.in);
        System.out.println("WEJŚĆIE: ");
        slowo = scanner.nextLine();
        slowo = slowo.toLowerCase();
        slowolengh = slowo.length();

        char[] tablica = new char[100];

        tablica = slowo.toCharArray();
        taknie = palindrom(tablica, slowolengh);

        if (taknie)
        {
            System.out.println("WYJŚĆIE: ");
            System.out.println("TAK");
        }
        else
        {
            System.out.println("WYJŚĆIE: ");
            System.out.println("NIE");
        }
    }
    public static boolean palindrom(char tablica[], int i){
        boolean jestpalidrom = true;
        for (int j = 0; j < i / 2; j++) {
            if (tablica[j] != tablica[i - j - 1]) {
                jestpalidrom = false;
                break;
            }
        }
        return jestpalidrom;
    }
}
