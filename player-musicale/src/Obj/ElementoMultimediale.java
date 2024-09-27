package Obj;

public class ElementoMultimediale {

    protected int durata;
    protected String titolo;

    public ElementoMultimediale(int durata, String titolo) {
        this.durata = durata;
        this.titolo = titolo;
    }

    public void play() {
        System.out.println("Playing...");
    }
}
