public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type,String number,String userType){
        switch(type){
            case TWOWHEELER:
            return new TwoWheelerVehicle(number,VehicleType.TWOWHEELER,userType);
            case FOURWHEELER:
            return new FourWheelerVehicle(number, VehicleType.FOURWHEELER,userType);
            default:
            return null;
        }
    }
}
