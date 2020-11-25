public class Televisoin implements ElectronicDevice {

    private int vloume = 0;

    @Override
    public void on() {
        System.out.println("TV is On");

    }

    @Override
    public void off() {
        System.out.println("TV is Off");

    }

    @Override
    public void volumeUp() {
        vloume++;
        System.out.println("TV volume is at: " + vloume);

    }

    @Override
    public void voulumeDown() {
        vloume--;
        System.out.println("TV volume is at: " + vloume);

    }

}
