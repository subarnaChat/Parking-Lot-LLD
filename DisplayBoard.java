public class DisplayBoard {
    private int id;
    private int generalSpotRemaining;
    private int handicappedSpotRemaining;

    public void displayAvailibility(ParkingFloor floor){
        generalSpotRemaining=floor.getCapGen()-floor.occupiedGeneral();
        handicappedSpotRemaining=floor.getCapHandi()-floor.occupiedHandi();
        System.out.println("Number of general spots remaining is "+generalSpotRemaining);
        System.out.println("Number of handicapped spots remaining is "+handicappedSpotRemaining);
    }
}
