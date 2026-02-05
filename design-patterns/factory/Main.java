import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle name : ");
        String name = sc.next();

        Vehicle vehicle = Factory.getVehicle(name);
        vehicle.vehicleType();

    }
}