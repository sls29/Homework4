package Homework4;


public class Car extends Vehicle {

    protected String carMaker;
    protected String carModel;
    protected String fuelType;
    protected int fuelTankSize;
    protected int gears;
    protected float consPer100Km;
    public float availableFuel;
    public  int tyreSize;

    public Car(String carMaker, String carModel, String fuelType, int fuelTankSize, int gears, float consPer100Km, float availableFuel, int tyreSize) {
        this.carMaker = carMaker;
        this.carModel = carModel;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.consPer100Km = consPer100Km;
        this.availableFuel = availableFuel;
        this.tyreSize = tyreSize;
    }
}
