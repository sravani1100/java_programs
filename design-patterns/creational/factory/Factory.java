
public class Factory{


    public static Vehicle getVehicle(String type){

        if(type == null){
            return null;
        }

        if(type.equalsIgnoreCase("car")){
            return new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }else if(type.equalsIgnoreCase("Truck")){
            return new Truck();
        }

        throw new IllegalArgumentException("Invalid vehicle name");
    }
}