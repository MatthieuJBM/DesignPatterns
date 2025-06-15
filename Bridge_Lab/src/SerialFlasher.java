public class SerialFlasher extends Flasher
{
public SerialFlasher(SerialDevice aDevice) 

    {
        super(aDevice);
    }
    public void communicateViaProtocall() {
        System.out.println("system komunikuje sie z urzadzeniem portu szeregowego");
    }
    public void flashDevice() {
        System.out.println("urzadzenie "+ myDevice.getType()+" portu szeregowego sygnalizuje prace");
    }
}