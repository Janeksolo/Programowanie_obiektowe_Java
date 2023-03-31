package zad29;

public class Dane {
    public char znak;
    public int znakpokonwersji;
    public char litera = 'M';

    int pozycjalitrey(char znak)
    {
        return Character.toLowerCase(znak) - 'a' + 1;
    }
    void czytrafiles(int pozycjalitey1, int pozycjalitery2) {
        if (pozycjalitey1 < pozycjalitery2) {
            System.out.println("Źle!");
            System.out.println("Trafiłeś zbyt nisko!");
        } else if (pozycjalitey1 > pozycjalitery2) {
            System.out.println("Źle!");
            System.out.println("Trafiłeś zbyt wysoko!");
        } else {
            System.out.println("Dobrze!");
        }
    }










}
