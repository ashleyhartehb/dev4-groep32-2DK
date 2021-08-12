package Model;

public class DriveReckless implements DriveBehavior {
    @Override
    public void Drive() {
        System.out.println("Weaves through traffic not caring about anything, But barely arriving safely at the destination");
    }
}
