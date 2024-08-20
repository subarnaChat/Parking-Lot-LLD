public class ParkingLotDemo {
    public static void main(String args[]){
        ParkingLot parkingLot=ParkingLot.getInstance("1", "building 1");

        EntryGate entryGate=new EntryGate(1);
        ExitGate exitGate=new ExitGate(1);
        parkingLot.addEntryGate(entryGate);
        parkingLot.addExitGate(exitGate);

        ParkingFloor parkingFloor0=new ParkingFloor(0, "ground floor", 5, 5);
        ParkingFloor parkingFloor1=new ParkingFloor(1, "first floor", 5, 5);
        parkingLot.addFloor(parkingFloor0);
        parkingLot.addFloor(parkingFloor1);

        //no spots added yet
        parkingFloor0.displayAvailibility();

        ParkingSpot parkingSpotGeneral=new ParkingSpotGeneral("general","1");
        ParkingSpot parkingSpotHandicapped=new ParkingSpotHandicapped("handicapped", "1");
        parkingFloor0.addParkingSpot(parkingSpotGeneral);
        parkingFloor0.addParkingSpot(parkingSpotHandicapped);

        Vehicle car=VehicleFactory.createVehicle(VehicleType.FOURWHEELER, "1234", "general");
        Vehicle bike=VehicleFactory.createVehicle(VehicleType.TWOWHEELER, "4567", "handicapped");

        parkingFloor0.assignVehicleToSpot(parkingSpotHandicapped, bike);
        parkingFloor0.assignVehicleToSpot(parkingSpotGeneral, car);

        //1 spot each added and vehicle assigned
        parkingFloor0.displayAvailibility();

        //vehicle removed
        parkingFloor0.removeVehicleFromSpot(parkingSpotHandicapped, bike);
        parkingFloor0.removeVehicleFromSpot(parkingSpotGeneral, car);

        parkingFloor0.displayAvailibility();
    }
}
