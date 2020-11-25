import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args) {

        ElectronicDevice newDevice = TvRemote.getDevice();

        TurnTvOn onCommand = new TurnTvOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnTvOff offCommand = new TurnTvOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        TurnTvUp volUpCommand = new TurnTvUp(newDevice);

        onPressed = new DeviceButton(volUpCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();
        onPressed.press();

        Televisoin theTv = new Televisoin();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(theTv);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();

    }

}
