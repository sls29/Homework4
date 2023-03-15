package Homework4;

public class Ford extends Car {
    protected String carModel;
    public float availableFuel;
    public int tireSize;
    private static String CHASSIS_NUMBER;

    public Ford (String carModel, String CHASSIS_NUMBER, int gears, String fuelType, int fuelTankSize, float availableFuel, float consPer100Km, int tireSize) {

        super(fuelType, fuelTankSize, gears, consPer100Km);

        this.carModel = carModel;
        this.CHASSIS_NUMBER = CHASSIS_NUMBER;
        this.tireSize = tireSize;
        this.availableFuel = availableFuel;

    }

}
