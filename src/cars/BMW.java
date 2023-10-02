package cars;

import baseClasses.Coupe;

public class BMW extends Coupe {

    public BMW(int maxSpeed, int weightKg, String colour, int horsePower, boolean isEngineRunning, boolean isHardTopOpened) {
        super(maxSpeed, weightKg, colour, horsePower, isEngineRunning, isHardTopOpened);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public void openHardTop() {
        super.openHardTop();
    }

    @Override
    public void closeHardTop() {
        super.closeHardTop();
    }
}
