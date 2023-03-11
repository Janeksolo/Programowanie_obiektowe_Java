import java.util.Scanner;

public class zadanie6 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double up = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("WEJŚCIE:");

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        upfct(a,b,c,up);
    }

    public static void upfct(double a,double b,double c,double up)
    {
        if(a>b)
        {
            up=a;
            a=b;
            b=up;
        }
        if(b>c)
        {
            up=b;
            b=c;
            c=up;
        }
        if(a>b)
        {
            up=a;
            a=b;
            b=up;
        }
        System.out.println("WYJŚCIE: ");
        System.out.println(a + " " + b + " " + c);
        if(a<b)
        {
            up=a;
            a=b;
            b=up;
        }
        if(b<c)
        {
            up=b;
            b=c;
            c=up;
        }
        if(a<b)
        {
            up=a;
            a=b;
            b=up;
        }
        System.out.println(a + " " + b + " " + c);
    }
}