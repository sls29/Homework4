package Homework4;

public class Car extends Vehicle {
    public String fuelType;
    public int fuelTankSize;
    public int gears;
    public float consPer100Km;
    public Car(String fuelType, int fuelTankSize, int gears, float consPer100Km) {

        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.consPer100Km = consPer100Km;
    }
}
