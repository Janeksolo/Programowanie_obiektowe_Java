package zad24;

public class Dane {

    public String napis1;
    public String napis2;

    boolean Czytakisam()
    {
        if (napis1 == null || napis2 == null)
        {
            return true;
        }

        if (napis1.length() != napis2.length())
        {
            return false;
        }

        for (int i = 0; i < napis1.length(); i++)
        {
            if (napis1.charAt(i) != napis2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
