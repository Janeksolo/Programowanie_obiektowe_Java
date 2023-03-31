package zda211;

import static zda211.Vehicle.litry;

public class VehicleProg {
    public static void main(String[] args) {
        //zad 2.11
        /*Vehicle miniVan = new Vehicle();
        miniVan.passemgers = 5;
        miniVan.fuelcap = 54;
        miniVan.lkm = 8.4;

        Vehicle sportsCar = new Vehicle();

        sportsCar.passemgers = 4;
        sportsCar.fuelcap = 42;
        sportsCar.lkm = 7.2;*/

        Vehicle miniVan = new Vehicle();
        miniVan.setPassemgersr(7);
        miniVan.setFuelcap(54);
        miniVan.setLkm(8.4);

        Vehicle sportsCar = new Vehicle();
        sportsCar.setPassemgersr(4);
        sportsCar.setFuelcap(42);
        sportsCar.setLkm(7.2);


        //zad 2.12
        /*System.out.println("Minivan przewozi "+ miniVan.getPassemgers() +" osób.");
        miniVan.range();
        System.out.println("Auto sportowe przewozi "+ sportsCar.getPassemgers() +" osób.");
        sportsCar.range();*/

        Vehicle.range(miniVan, sportsCar);
        Vehicle.litry(miniVan, sportsCar);
    }
}
