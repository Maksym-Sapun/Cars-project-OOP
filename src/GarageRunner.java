import baseClasses.AbstractVehicle;
import baseClasses.Coupe;
import baseClasses.Suv;
import baseClasses.Truck;
import interfaces.CoupeCar;

public class GarageRunner {

    public static void main(String[] args) {
        CoupeCar mers = new Coupe(250, 2000, "Grey", 350, false, false);

        mers.openHardTop();
        mers.openHardTop();
        mers.closeHardTop();
        mers.closeHardTop();




    }
}
