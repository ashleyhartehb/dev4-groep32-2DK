//Code by Michalis Van Steen
package Model;

public class BikeDeliveryGuy extends DeliveryGuy {
    public BikeDeliveryGuy() {
        super.driveBehavior = new DriveWithoutDelivery();
    }
}
