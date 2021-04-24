package Task9;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;

    public FourWheeler(String vID, String vName, int numWheels, boolean powerSteer) {
       vehicleNo = vID;
        vehicleName=vName;
        wheels= numWheels;
        this.powerSteer = powerSteer;
    }
    public void showDetail(){
        System.out.println("Vehicle no:"+vehicleNo);
        System.out.println("Vehicle name:"+vehicleName);
        System.out.println("Number of Wheels:"+wheels);

        if (powerSteer == true){
            System.out.println("Power Steering:yes");
        }else {
            System.out.println("Power Steering:no");
        }
    }
}
