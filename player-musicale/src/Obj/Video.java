package Obj;

public class Video extends ElementoMultimediale {

    private int luminosita;
    private int volume;

    public Video(int durata, String titolo, int luminosita, int volume) {
        super(durata, titolo);
        this.luminosita = luminosita;
        this.volume = volume;
    }

    public void aumentaLuminosita() {
        this.luminosita++;
    }

    public void diminuisciLuminosita() {
        this.luminosita--;
    }

    @Override
    public void play() {
        String exclamations = "";
        for(int i = 0; i < volume; i++) {
            exclamations += "!";
        }

        String asterisks = "";
        for(int i = 0; i < luminosita; i++) {
            asterisks += "*";
        }

        for(int i = 0; i < durata; i++) {
            System.out.println(titolo + exclamations + asterisks);
        }

    }
}
