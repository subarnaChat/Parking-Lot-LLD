import java.util.ArrayList;
import java.util.List;

public class ParkingLot{
    private String parkingLotID;
    private String parkingLotLocation;
    private List<ParkingFloor> floors;
    private List<EntryGate> entries;
    private List<ExitGate> exits;

    private ParkingLot(String id,String location){
        this.parkingLotID=id;
        this.parkingLotLocation=location;
        floors=new ArrayList<>();
        entries=new ArrayList<>();
        exits=new ArrayList<>();
        System.out.println("Parking lot instance initilaised");
    }

    private static ParkingLot instance;

    public static ParkingLot getInstance(String id,String location){
        if(instance==null){
            instance=new ParkingLot(id,location);
        }

        return instance;
    }

    public void setId(String parkingLotID){
        this.parkingLotID=parkingLotID;
    }

    public String getID(){
        return parkingLotID;
    }

    public void setLocation(String parkingLotLocation){
        this.parkingLotLocation=parkingLotLocation;
    }

    public String getLocation(){
        return parkingLotLocation;
    }

    public void addFloor(ParkingFloor parkingFloor){
        floors.add(parkingFloor);
    }

    public void removeFloor(ParkingFloor parkingFloor){
        floors.remove(parkingFloor);
    }

    public void addEntryGate(EntryGate eGate){
        entries.add(eGate);
    }

    public void removeEntryGate(EntryGate eGate){
        entries.remove(eGate);
    }

    public void addExitGate(ExitGate eGate){
        exits.add(eGate);
    }

    public void removeExitGate(ExitGate eGate){
        exits.remove(eGate);
    }
}