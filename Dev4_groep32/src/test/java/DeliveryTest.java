//Code by Michalis Van Steen
import Model.*;
import org.junit.jupiter.api.Test;

class DeliveryTest {
    @Test
    void createAndDeliverFood() {




        DeliveryGuy bikeDeliveryGuy = new BikeDeliveryGuy();
        bikeDeliveryGuy.Drive();

        //-----------------Delivery1
        bikeDeliveryGuy.setDriveBehaviour(new OnRouteToCollectDelivery());
        bikeDeliveryGuy.Drive();
        Food delivery1 = new TypeofFood();
        delivery1 = new Vegetables(delivery1);
        delivery1 = new Sauce(delivery1);
        delivery1 = new Meat(delivery1);
        System.out.println(((Meat) delivery1).getDescription() + ", Total price is: $" + Math.round(((Meat) delivery1).Price()* 100.0) / 100.0);
        bikeDeliveryGuy.setDriveBehaviour(new DriveReckless());
        bikeDeliveryGuy.Drive();

        //-----------------Delivery2
        bikeDeliveryGuy.setDriveBehaviour(new OnRouteToCollectDelivery());
        bikeDeliveryGuy.Drive();
        Food delivery2 = new TypeofFood();
        delivery2 = new Vegetables(delivery2);
        delivery2 = new Sauce(delivery2);
        delivery2 = new Meat(delivery2);
        System.out.println(((Meat) delivery2).getDescription() + ", Total price is: $" + Math.round(((Meat) delivery2).Price()* 100.0) / 100.0);
        bikeDeliveryGuy.setDriveBehaviour(new DriveWithCaution());
        bikeDeliveryGuy.Drive();

        //-----------------Delivery's are done
        bikeDeliveryGuy.setDriveBehaviour(new DriveWithoutDelivery());
        bikeDeliveryGuy.Drive();

    }
}