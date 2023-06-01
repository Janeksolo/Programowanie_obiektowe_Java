package java_projekt;

import java.util.List;

class Pizza {
    private String nazwa;
    private List<String> skladniki;
    private int ostrosc;
    private double cena;

    public Pizza(String nazwa, List<String> skladniki, int ostrosc, double cena) {
        this.nazwa = nazwa;
        this.skladniki = skladniki;
        this.ostrosc = ostrosc;
        this.cena = cena;
    }



    public String getNazwa() {
        return nazwa;
    }

    public List<String> getSkladniki() {
        return skladniki;
    }

    public int getOstrosc() {
        return ostrosc;
    }

    public double getCena() {
        return cena;
    }
}

