package Homework4;

public class Ford extends Car {


    public int tireSize;


    public Ford (int gears, String fuelType, int fuelTankSize, float consPer100Km, int tireSize) {

        super(fuelType, fuelTankSize, gears, consPer100Km);


        this.tireSize = tireSize;


    }

}
