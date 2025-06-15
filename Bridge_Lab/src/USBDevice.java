public class USBDevice extends Device
{
    public USBDevice(){
        type="USB";
        deviceConnectionStatus=true;
    }
    public boolean validateDevice() {
        System.out.println("system zatwierdzil urzadzenie portu USB");
        return true;
    }
}