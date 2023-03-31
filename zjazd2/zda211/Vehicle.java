package zda211;

public class Vehicle {
    //zad 2.11
    //public int passemgers;
    //public double fuelcap;
    //public double lkm;

    private int passemgers;
    private double fuelcap;
    private double lkm;

    public void setPassemgersr(int wartosc)
    {
        this.passemgers = wartosc;
    }
    public void setFuelcap(double wartosc)
    {
        this.fuelcap = wartosc;
    }
    public void setLkm(double wartosc)
    {
        this.lkm = wartosc;
    }

    public int getPassemgers()
    {
        return passemgers;
    }
    public double getFuelcap()
    {
        return fuelcap;
    }
    public double getLkm()
    {
        return lkm;
    }

    //zad 2.12
    /*void range()
    {
        double wynik = fuelcap * lkm;
        System.out.println("Zasięg (km): "+wynik);
    }*/

    public static void range(Vehicle miniVan, Vehicle sportsCar)
    {
        double range1 = miniVan.getFuelcap() * miniVan.getLkm();
        double range2 = sportsCar.getFuelcap() * sportsCar.getLkm();

        System.out.println("Minivan przewozi " + miniVan.getPassemgers() + " osób na odległość do " + range1 + " kilometrów.");
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassemgers() + " osób na odległość do " + range2 + " kilometrów.");
    }
    //zad 2.15
    public  static void litry(Vehicle miniVan, Vehicle sportsCar)
    {
        double range1 = miniVan.getFuelcap();
        double range2 = sportsCar.getFuelcap();
        System.out.println("Minivan potrzebuje "+range1+" litrów paliwa.");
        System.out.println("Autosportowe potrzebuje "+range2+" litrów paliwa.");
    }


}
