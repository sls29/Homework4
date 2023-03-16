package Homework4;

abstract class Vehicle implements VehicleInterface {
    protected String FUEL_TYPE;
    protected final static int FUEL_TANK_SIZE = 45;
    protected final static int GEARS = 6;
    protected static float CONS_PER100_KM = 5.8f;

    double fuelConsumed;
    double availableFuel = 40;
    int gear = 0;
    double totalDistance = 0;
    double consumption;
    double afc;
    float fuelConstant = 1;

    public void start() {

        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void drive(double distance) {
        fuelConsumed = (distance * CONS_PER100_KM / 100) * fuelConstant;
        availableFuel -= fuelConsumed;
        totalDistance += distance;
        System.out.println("Vehicle has run " + distance + " km. Fuel available: " +
                availableFuel + "l. Dist: " + totalDistance + "km");

    }

    public void shiftGear(int inputGear) {

        if (inputGear <= GEARS && inputGear > gear) {
            gear++;
            fuelConstant *= 0.98;
        } else if (inputGear <= GEARS && inputGear == gear) {
            gear = inputGear;
        } else {
            gear--;
            fuelConstant *= 1.02;
        }
        System.out.println("Gear shifted in " + gear + " " + fuelConstant);

    }

    public Double getAvailableFuel() {
        System.out.println("Fuel available: " + availableFuel);
        return availableFuel;
    }

    public Double getAverageFuelConsumption() {
        try {
            afc = (40 - availableFuel) / totalDistance;
            System.out.println("AFC : " + afc * 100);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
        return afc * 100;
    }

}

