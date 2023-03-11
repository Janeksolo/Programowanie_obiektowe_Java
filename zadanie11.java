
import java.util.Scanner;
public class zadanie11 {

    public static void main(String[] args) {

        String zdanie;
        System.out.println("Wejście: ");
        Scanner scanner1 = new Scanner(System.in);
        zdanie = scanner1.nextLine();
        String zdanie2 = zdanie.toLowerCase();
        char[] zdaniedochar = zdanie2.toCharArray();
        System.out.println("Wyjście: ");
        boolean wynik = jestpangram(zdaniedochar);
        System.out.println(wynik);
    }
    public static boolean jestpangram(char zdanie[]) {
        int []tablica = new int[26];

        for (char c:zdanie) {
            if (c >= 'a' && c <= 'z') {
                tablica[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (tablica[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
