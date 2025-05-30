import devices.Device;
import devices.Radio;
import devices.Tv;
import remotes.AdvancedRemote;
import remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        System.out.println("BRIDGE PATTERN!");

        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}