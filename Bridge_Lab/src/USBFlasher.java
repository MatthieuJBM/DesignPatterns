public class USBFlasher extends Flasher
{
	public USBFlasher(USBDevice aDevice) 
    {
      super(aDevice);
    }

	public void communicateViaProtocall() 
	{
        System.out.println("system komunikuje sie z urzadzeniem portu USB");
    }
    
	public void flashDevice()
	{
      System.out.println("urzadzenie "+myDevice.getType()+" portu USB sygnalizuje prace");
    }
}