public class TurnTvUp implements Command {

    ElectronicDevice theDevice;

    public TurnTvUp(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();

    }

    @Override
    public void undo() {
        theDevice.voulumeDown();

    }

}
