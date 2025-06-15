public abstract class Flasher {
    protected Device myDevice = null;
    public boolean flashStatus=false;
    public Flasher(Device aDevice){
        myDevice=aDevice;
    }
    public void connectDevice(){
        myDevice.connectDevice();
    }
    public void validateDevice(){
        if(myDevice.validateDevice()){
            System.out.println("urzadzenie " + myDevice.getType()+" zostalo zatwierdzone przez system");
            flashStatus=true;
        }else{
            System.out.println("urządzenie " + myDevice.getType()+" nie zostalo zatwierdzone przez system");
        }
    }
    public void initFlashing(){
        System.out.println("urzadzenie "+ myDevice.getType() +" sygnalizuje gotowość poprzez miganie diody");
    }
    public abstract void communicateViaProtocall();
    public abstract void flashDevice();
    public void eject(){
        myDevice.ejectDevice();
    }
}