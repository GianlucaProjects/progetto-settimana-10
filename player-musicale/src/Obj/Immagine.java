package Obj;

public class Immagine extends ElementoMultimediale {

    private int luminosita;

    public Immagine(int luminosita) {
        super(0, "Immagine");
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        this.luminosita++;
    }

    public void diminuisciLuminosita() {
        this.luminosita--;
    }

    public void show() {
        String asterisks = "";
        for(int i = 0; i < luminosita; i++) {
            asterisks += "*";
        }
        System.out.println(titolo + asterisks);
    }
}
