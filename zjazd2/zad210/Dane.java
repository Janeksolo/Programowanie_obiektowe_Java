package zad210;

public class Dane {
    private int pocztek = 0;
    private int liczdopot = 2;

    void funkcjapotega(){
        for (int i = 0;i <=14;i++)
        {
            int podstawa = 1;
            if (i == 0)
            {
                System.out.println("2 do potęgi " + i + " wynosi: " + 1);
            }
            else
            {
                for (int z = 1; z <= i; z++) {
                    podstawa *= liczdopot;
                }
                System.out.println("2 do potęgi " + i + " wynosi: " + podstawa);
            }
        }
    }
}
