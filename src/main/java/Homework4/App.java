package Homework4;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {

    // Car ford1 = new Ford( 6, "diesel", 45, 5.8f, 15);
    Car focus1 = new Focus( 40, "123456QWERTY", 6,
            "diesel", 45, 5.8f, 15);

    focus1.start();
    focus1.shiftGear();

    }
}
