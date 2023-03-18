package Homework4;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {

    // Car ford1 = new Ford( 6, "diesel", 45, 5.8f, 15);
    Car car = new Focus( 40, "123456QWERTY", 6,
            "diesel", 45, 5.8f, 16);

        car.start();

        car.shiftGear(1);

        car.drive(0.01); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

       double availableFuel = car.getAvailableFuel();

      double fuelConsumedPer100Km = car.getAverageFuelConsumption();


    }
}
