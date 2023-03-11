import java.util.Scanner;

public class zadanie4 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("WEJŚCIE:");

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if(a >= 0 && b >= 0 && c >= 0 )
        {
            if (a+b > c)
            {
                if (a+c > b)
                {
                    if (b+b > a)
                    {
                        System.out.println("WYJŚCIE:");
                        System.out.println("TAK");
                    }
                    else
                    {
                        System.out.println("WYJŚCIE:");
                        System.out.println("NIE");
                    }
                }
                else
                {
                    System.out.println("WYJŚCIE:");
                    System.out.println("NIE");
                }
            }
            else
            {
                System.out.println("WYJŚCIE:");
                System.out.println("NIE");
            }

        }
        else
        {
            System.out.println("WYJŚCIE:");
            System.out.println("błąd");
        }
    }
}

