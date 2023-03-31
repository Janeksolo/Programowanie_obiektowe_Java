package zad25;

public class Dane {
    private int x = 5;
    private int y = 10;
    private float w = 33.5F;
    private float z = 17.3F;
    private int m = 3;
    private int n = 17;
    private int o = 10;

    void inkrementacja()
    {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        x = ++x;
        System.out.println("++x = " + x);
        y = y++;
        System.out.println("y++ = "+y);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("~~~~~~~~~~~~");
    }
    void arytmetyczne()
    {
        System.out.println("w = "+w);
        System.out.println("z = "+z);
        System.out.println("w + z = "+ (w + z));
        System.out.println("w - z = "+ (w - z));
        System.out.println("w * z = "+ (w * z));
        System.out.println("w / z = "+ (w / z));
        System.out.println("w % z = "+ (w % z));
        System.out.println("~~~~~~~~~~~~");
    }
    void relacyjne()
    {
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        System.out.println("o = "+o);
        System.out.println();
        System.out.println("m < n = "+(m < n));
        System.out.println("m > o = "+(m > o));
        System.out.println("n <= o = "+(n <= o));
        System.out.println("m >= n = "+(m >= n));
        System.out.println("n == o = "+(n == o));
        System.out.println("m != o = "+(m != o));
        System.out.println("~~~~~~~~~~~~");
    }

}
