package baseClasses;

import interfaces.SuvCar;

public class Suv extends AbstractVehicle implements SuvCar {
    private boolean isThirdRowOpened;

    public Suv(int maxSpeed, int weightKg, String colour, int horsePower, boolean isEngineRunning, boolean isThirdRowOpened) {
        super(maxSpeed, weightKg, colour, horsePower, isEngineRunning);
        this.isThirdRowOpened = isThirdRowOpened;
    }

    @Override
    public void startEngine() {
        if (isEngineRunning) {
            System.out.println("Engine of SUV is already running");
        } else {
            isEngineRunning = true;
            System.out.println("Engine of SUV started");
        }
    }

    @Override
    public void stopEngine() {
        if (!isEngineRunning) {
            System.out.println("The Engine of SUV is not running");
        } else {
            isEngineRunning = false;
            System.out.println("Engine of SUV stoped");
        }
    }

    @Override
    public void openThirdRowSeats() {
        if (isThirdRowOpened) {
            System.out.println("Third row seats of SUV is already opened");
        } else {
            isThirdRowOpened = true;
            System.out.println("Third row seats of SUV is opened");
        }
    }

    @Override
    public void closeThirdRowSeats() {
        if (!isThirdRowOpened) {
            System.out.println("Third row seats of SUV is already closed");
        }
        else {
            isThirdRowOpened = false;
            System.out.println("Third row seats of SUV is closed");
        }
    }
}
