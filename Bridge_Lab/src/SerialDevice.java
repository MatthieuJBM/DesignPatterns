public class SerialDevice extends Device{
    public SerialDevice(){
        type="portu szeregowego";
        deviceConnectionStatus=true;
    }
    public boolean validateDevice() {
        System.out.println("system zatwierdzil urzadzenie portu szeregowego");
        return true;
    }
}