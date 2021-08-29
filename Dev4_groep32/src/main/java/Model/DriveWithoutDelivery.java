//Code by Michalis Van Steen
package Model;

public class DriveWithoutDelivery implements DriveBehavior {
    @Override
    public void Drive() {
        System.out.println("Just driving around aimlessly");
    }
}
