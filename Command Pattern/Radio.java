public class Radio implements ElectronicDevice {

    private int vloume = 0;

    @Override
    public void on() {
        System.out.println("Radio is On");

    }

    @Override
    public void off() {
        System.out.println("Radio is Off");

    }

    @Override
    public void volumeUp() {
        vloume++;
        System.out.println("Radio volume is at: " + vloume);

    }

    @Override
    public void voulumeDown() {
        vloume--;
        System.out.println("Radio volume is at: " + vloume);

    }

}
