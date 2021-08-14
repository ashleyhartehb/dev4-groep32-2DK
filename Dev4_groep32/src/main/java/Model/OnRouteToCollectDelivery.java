package Model;

public class OnRouteToCollectDelivery implements DriveBehavior{
    @Override
    public void Drive() {
        System.out.println("On his way to collect the food");
    }
}
