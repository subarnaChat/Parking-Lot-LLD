public abstract class ParkingSpot {
    private String number;
    private boolean isFree;
    private Vehicle vehicle;
    private String type;

    public ParkingSpot(String type,String number){
        this.type=type;
        this.number=number;
    }

    public String getNumber(){
        return number;
    }

    public String getType(){
        return type;
    }
    public boolean isSpotFree(){
        return isFree;
    }

    public void assignVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isFree=false;
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicle=null;
        isFree=true;
    }
}
