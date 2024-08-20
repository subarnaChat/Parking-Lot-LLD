public abstract class Vehicle {
    private String liscenceNumber;
    private VehicleType type;
    private Ticket ticket;
    private String userType;

    public Vehicle(String liscenceNumber,VehicleType type,String userType){
        this.liscenceNumber=liscenceNumber;
        this.type=type;
        this.userType=userType;
    }

    public void assignTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String getLiscenceNumber(){
        return liscenceNumber;
    }

    public VehicleType getVehicleType(){
        return type;
    }

    public String getUserType(){
        return userType;
    }
}
