package zad27;

import java.text.DecimalFormat;

public class Dane {
    public float promienwalca;
    public float wysokoscwalca;

    String obliczwynik()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        float liczba = (float) (Math.PI * (promienwalca * promienwalca) * wysokoscwalca);
        return df.format(liczba);
    }
}
