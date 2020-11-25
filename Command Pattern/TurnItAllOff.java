import java.util.List;

public class TurnItAllOff implements Command {
    List<ElectronicDevice> thedevices;

    public TurnItAllOff(List<ElectronicDevice> thedevices) {
        this.thedevices = thedevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : thedevices) {
            device.off();
        }

    }

    @Override
    public void undo() {
        for (ElectronicDevice device : thedevices) {
            device.on();
        }

    }

}
