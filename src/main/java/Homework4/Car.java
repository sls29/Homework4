package Homework4;

abstract class Car  extends Vehicle
                    implements CarInterface {
    protected String FUEL_TYPE;
    protected static int FUEL_TANK_SIZE;
    protected static int GEARS;
    protected static float CONS_PER100_KM;
    public Car(String FUEL_TYPE, int FUEL_TANK_SIZE, int GEARS, float CONS_PER100_KM) {

        this.FUEL_TYPE = FUEL_TYPE;
        this.FUEL_TANK_SIZE = FUEL_TANK_SIZE;
        this.GEARS = GEARS;
        this.CONS_PER100_KM = CONS_PER100_KM;
    }

    public void shiftGear() {
        System.out.println("Gear shifted");
    }

    public void getAvailableFuel(){
        System.out.println("Fuel available: xx");
    }

    public void getAverageFuelConsumption(){
        System.out.println("AFC = : xx");
    }
}
