package Homework4;

public class Focus extends Ford{

    public int availableFuel;
    public String CHASSIS_NUMBER;

    public Focus(int availableFuel, String CHASSIS_NUMBER,
                 int gears, String fuelType, int fuelTankSize,
                 float consPer100Km, int tireSize) {
        super(gears, fuelType, fuelTankSize, consPer100Km, tireSize);

    this.availableFuel = availableFuel;
    this.CHASSIS_NUMBER = CHASSIS_NUMBER;

    }
}
