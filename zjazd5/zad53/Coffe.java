package zad53;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;


public class Coffe implements CoffeInteface{

    protected List<String> coffeeTypes = Arrays.asList("espresso", "latte", "cappuccino", "mocha", "auLait", "macchiato");

    public void drukujNormalnie(){
        System.out.print("[ ");
        for (String coffeeType : coffeeTypes) {;
            System.out.print(coffeeType + " ,");
        }
        System.out.println(" ]");

    }
    public void drukujPoKoleji(){
        Iterator<String> iterator = coffeeTypes.iterator();
        while (iterator.hasNext()) {
            String kawa = iterator.next();
            System.out.println(kawa);
        }
    }

    public void drukujDuzeLitery(){
        for (String napoj : coffeeTypes) {
            System.out.println(napoj.toUpperCase());
        }
    }
    public void drukujCzteryLitery(){
        for (String napoj : coffeeTypes) {
            System.out.println(napoj.substring(0, 4));
        }
    }
}