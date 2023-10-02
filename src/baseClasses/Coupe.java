package baseClasses;

import interfaces.CoupeCar;

public class Coupe extends AbstractVehicle implements CoupeCar {
    private boolean isHardTopOpened;

    public Coupe(int maxSpeed, int weightKg, String colour, int horsePower, boolean isEngineRunning, boolean isHardTopOpened) {
        super(maxSpeed, weightKg, colour, horsePower, isEngineRunning);
        this.isHardTopOpened = isHardTopOpened;
    }

    @Override
    public void startEngine() {
        if (isEngineRunning) {
            System.out.println("Engine of coupe is already running");
        } else {
            isEngineRunning = true;
            System.out.println("Engine of coupe started");
        }
    }

    @Override
    public void stopEngine() {
        if (!isEngineRunning) {
            System.out.println("The Engine of coupe is not running");
        } else {
            isEngineRunning = false;
            System.out.println("Engine of coupe stoped");
        }
    }

    @Override
    public void openHardTop() {
        if (isHardTopOpened) {
            System.out.println("The hard top of coupe is already opened");
        } else {
            isHardTopOpened = true;
            System.out.println("The hard top of coupe is opened");
        }
    }

    @Override
    public void closeHardTop() {
        if (!isHardTopOpened) {
            System.out.println("The hard top of coupe is already closed");
        } else {
            isHardTopOpened = false;
            System.out.println("The hard top of coupe is closed");
        }
    }
}
