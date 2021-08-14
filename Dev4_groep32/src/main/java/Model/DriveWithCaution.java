package Model;

public class DriveWithCaution implements DriveBehavior {
    @Override
    public void Drive() {
        System.out.println("Drives safely to assure a good and hot delivery takes place");
    }
}
