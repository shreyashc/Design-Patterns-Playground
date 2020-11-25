public class TurnTvOn implements Command {

    ElectronicDevice theDevice;

    public TurnTvOn(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.on();

    }

    @Override
    public void undo() {
        theDevice.off();

    }

}
