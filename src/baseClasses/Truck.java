package baseClasses;

import interfaces.TruckCar;

public class Truck extends AbstractVehicle implements TruckCar {
    private boolean isTruckRampOpened;

    public Truck(int maxSpeed, int weightKg, String colour, int horsePower, boolean isEngineRunning, boolean isTruckRampOpened) {
        super(maxSpeed, weightKg, colour, horsePower, isEngineRunning);
        this.isTruckRampOpened = isTruckRampOpened;
    }

    @Override
    public void startEngine() {
        if (isEngineRunning) {
            System.out.println("Engine of Truck is already running");
        } else {
            isEngineRunning = true;
            System.out.println("Engine of Truck started");
        }
    }

    @Override
    public void stopEngine() {
        if (!isEngineRunning) {
            System.out.println("The Engine of Truck is not running");
        } else {
            isEngineRunning = false;
            System.out.println("Engine of Truck stoped");
        }    }

    @Override
    public void openTruckRamp() {
        if (isTruckRampOpened) {
            System.out.println("The truck ramp is already opened");
        } else {
            isTruckRampOpened = true;
            System.out.println("The truck ramp is opened");
        }
    }

    @Override
    public void closeTruckRamp() {
        if (!isTruckRampOpened) {
            System.out.println("The truck ramp is already closed");
        }
        else {
            isTruckRampOpened = false;
            System.out.println("The truck ramp is closed");
        }
    }
}
