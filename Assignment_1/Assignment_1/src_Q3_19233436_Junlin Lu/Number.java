/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: Abstract class Number.
 * Has main().
 * I created two objects, the first one is the Circle whose radius has to be double(NumberDouble).
 * The other one is the Circle whose radius has to be int(NumberInt).
 * Then output their area.
 * There is also an abstract method getValue(). It is declared to ensure that the subclasses of Number can use this method
 * to get the value of the (wrapped) primitive variable.
 */
public abstract class Number {
    public static void main(String[] args) {

        Circle<NumberDouble> circle = new Circle<>(new NumberDouble(10.6));
        Circle<NumberInt> circle1 = new Circle<>(new NumberInt(10));
        System.out.println("Area"+circle.calcArea().getValue());
        System.out.println("Area"+circle1.calcArea().getValue());
    }
    public abstract java.lang.Number getValue();
}
