package example1;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setRadioStation(new KissFM());
        radio.play();
        radio.nextStation();
        radio.play();
    }
}
