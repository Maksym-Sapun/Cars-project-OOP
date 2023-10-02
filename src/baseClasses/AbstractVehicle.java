package baseClasses;

public abstract class AbstractVehicle {
    private int maxSpeed;
    private int weightKg;
    private String colour;
    private int horsePower;
    protected boolean isEngineRunning;

    public AbstractVehicle(int maxSpeed, int weightKg, String colour, int horsePower, boolean isEngineRunning) {
        this.maxSpeed = maxSpeed;
        this.weightKg = weightKg;
        this.colour = colour;
        this.horsePower = horsePower;
        this.isEngineRunning = isEngineRunning;
    }

    public void startEngine() {
        if (isEngineRunning) {
            System.out.println("Engine is already running");
        } else {
            isEngineRunning = true;
            System.out.println("Engine started");
        }
    }

    public void stopEngine() {
        if (!isEngineRunning) {
            System.out.println("The engine is not running");
        } else {
            isEngineRunning = false;
            System.out.println("Engine stoped");
        }
    }


}
