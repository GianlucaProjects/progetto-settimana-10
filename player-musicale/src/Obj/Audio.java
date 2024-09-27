package Obj;

public class Audio extends ElementoMultimediale {

    private int volume;

    public Audio(int durata, String titolo, int volume) {
        super(durata, titolo);
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private void abbassaVolume() {
        System.out.println("Volume abbassato!");
    }

    private void alzaVolume() {
        System.out.println("Volume alzato!");
    }

    @Override
    public void play() {
        String exclamations = "";
        for(int i = 0; i < volume; i++) {
            exclamations += "!";
        }
        for(int i = 0; i < durata; i++) {
            System.out.println(titolo + exclamations);

        }
    }
}
