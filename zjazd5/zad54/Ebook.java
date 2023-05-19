package zad54;

public class Ebook extends ksiazka{
    protected int rozmiar;
    protected String format;

    public Ebook(String tytul, String autor, int liczbaStron,int rozmiar,String format) {
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }
}
