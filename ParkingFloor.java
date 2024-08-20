import java.util.HashMap;

public class ParkingFloor {
    private int floorNo;
    private String name;
    private int capacityGeneral;
    private int capacityHandicapped;
    private HashMap<String,ParkingSpot> spotsGeneral;
    private HashMap<String,ParkingSpot> spotsHandicapped;
    //private DisplayBoard board;

    public ParkingFloor(int floorNo,String name,int capacityGeneral,int capacityHandicapped){
        this.floorNo=floorNo;
        this.name=name;
        this.capacityGeneral=capacityGeneral;
        this.capacityHandicapped=capacityHandicapped;
        this.spotsGeneral=new HashMap<>();
        this.spotsHandicapped=new HashMap<>();
    }

    public int getCapGen(){
        return capacityGeneral;
    }
    
    public int getCapHandi(){
        return capacityHandicapped;
    }

    public int occupiedGeneral(){
        return spotsGeneral.size();
    }

    public int occupiedHandi(){
        return spotsHandicapped.size();
    }

    public void addParkingSpot(ParkingSpot spot){
        if(spot.getType().equals("general")){
            spotsGeneral.put(spot.getNumber(), spot);
        }
        else if(spot.getType().equals("handicapped")){
            spotsHandicapped.put(spot.getNumber(), spot);
        }
        else{
            System.out.println("Invalid spot type");
        }
    }

    public void removeParkingSpot(ParkingSpot spot){
        if(spot.getType().equals("general")){
            spotsGeneral.remove(spot.getNumber(), spot);
        }
        else if(spot.getType().equals("handicapped")){
            spotsHandicapped.remove(spot.getNumber(), spot);
        }
        else{
            System.out.println("Invalid spot type");
        }
    }

    boolean isFull(){
        if(spotsGeneral.size()==capacityGeneral && spotsHandicapped.size()==capacityHandicapped)
        return true;
        else
        return false;
    }

    public void assignVehicleToSpot(ParkingSpot spot,Vehicle vehicle){
        if(!isFull()){
            spot.assignVehicle(vehicle);
        }
        else{
            System.out.println("All spots occupied");
        }
    }

    public void removeVehicleFromSpot(ParkingSpot spot,Vehicle vehicle){
        spot.removeVehicle(vehicle);
    }

    public void displayAvailibility(){
        int freespotsGen=0,freespothandi=0;
        for (HashMap.Entry<String, ParkingSpot> entry : spotsGeneral.entrySet()) {
            ParkingSpot value = entry.getValue();
            if(value.isSpotFree()){
                freespotsGen++;
            }
        }

        for(HashMap.Entry<String, ParkingSpot> entry : spotsHandicapped.entrySet()) {
            ParkingSpot value = entry.getValue();
            if(value.isSpotFree()){
                freespothandi++;
            }
        }

        System.out.println("Number of general spots remaining is "+freespotsGen);
        System.out.println("Number of handicapped spots remaining is "+freespothandi);
    }

}
