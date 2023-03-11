import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args)
    {
        int dzien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WEJŚCIE");
        dzien = scanner.nextInt();

        switch (dzien)
        {
            case 1:
            {
                System.out.println("WYJŚCIE");
                System.out.println("styczeń: 31");
                break;
            }
            case 2:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Luty: 29");
                break;
            }
            case 3:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Marzec: 31");
                break;
            }
            case 4:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Kwiecień: 30");
                break;
            }
            case 5:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Maj: 31");
                break;
            }
            case 6:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Czerwiec: 30");
                break;
            }
            case 7:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Lipec: 31");
                break;
            }
            case 8:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Sierpień: 31");
                break;
            }
            case 9:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Wrzesień: 30");
                break;
            }
            case 10:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Pazdziernik: 31");
                break;
            }
            case 11:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Listopad: 30");
                break;
            }
            case 12:
            {
                System.out.println("WYJŚCIE");
                System.out.println("Grudzień: 31");
                break;
            }
            default:
            {
                System.out.println("WYJŚCIE");
                System.out.println("błąd");
                break;
            }
        }


    }

}