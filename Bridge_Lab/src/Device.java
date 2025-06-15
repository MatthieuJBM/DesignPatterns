public abstract class Device
{
	protected String type="Urzadzenie";
	protected boolean deviceConnectionStatus=false;
	public String getType() 
	{
		return type;
	}
	
	public void connectDevice()
	{
		System.out.println("urzadzenie jest podlaczone"); 
		deviceConnectionStatus=true;
	}

	public abstract boolean validateDevice();

	public void ejectDevice()
	{
		System.out.println("usuwanie z portu....");
		deviceConnectionStatus=false;
	} 
}