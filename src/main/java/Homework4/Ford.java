package Homework4;

public class Ford extends Car {
    protected String carModel;
    public float availableFuel;
    public int tireSize;
    public String chassisNumber;

    public Ford (String carModel, String chassisNumber, int gears, String fuelType, int fuelTankSize, float availableFuel, float consPer100Km, int tireSize) {

        super(fuelType, fuelTankSize, gears, consPer100Km);

        this.carModel = carModel;
        this.chassisNumber = chassisNumber;
        this.tireSize = tireSize;
        this.availableFuel = availableFuel;

    }

}
