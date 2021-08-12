package Model;

public abstract class DeliveryGuy {
    protected DriveBehavior driveBehavior;
    public DeliveryGuy() {
        driveBehavior = new DriveWithoutDelivery();
    }

    public void Drive() {
        driveBehavior.Drive(); //delegation
    }

//    public void FinishedDelivery() {
//        this.driveBehavior = new DriveWithoutDelivery();
//    }
//
//    public void GoingToCollectDelivery() {
//        this.driveBehavior = new OnRouteToCollectDelivery();
//    }

    public void setDriveBehaviour(DriveBehavior driveBehavior) {
        if (driveBehavior != null)
        if (driveBehavior != null)
            this.driveBehavior = driveBehavior;
    }
}
