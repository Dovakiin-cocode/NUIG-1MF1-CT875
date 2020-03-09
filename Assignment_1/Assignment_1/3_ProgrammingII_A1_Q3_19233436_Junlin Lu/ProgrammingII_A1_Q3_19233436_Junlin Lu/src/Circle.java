/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description:
 * This is a Circle class with a type parameter T, which represents any subclass of a new abstract class Number.
 * And this class is a subclass of GeometricFigure2.
 */
public class Circle<T extends Number> extends GeometricFigure2 {

    private T radius;
    private T area;


    //constructor
    public Circle(T radius){
        this.radius = radius;
    }



    /**
     * This is an method which returns a object of Number.
     * Firstly declare a Number variable 'area' initialized as 'null'.
     * If T is NumberDouble, create a new object of NumberDouble by passing the area(double) into the constructor.
     * If T is NumberDouble, I firstly create a new object of NumberInt by passing the square of radius(int) into the
     * constructor. Then reassign the reference variable 'area' with a new address of NumberDouble by passing in the PI.
     * The reason I did this is to make the result of calculating area accurate.
     * After all the PI should not be rounded here even if the radius is supposed to be int.
     * Finally, return area
     * @return Number
     */

    public Number calcArea() {
        Number area = null;
        if(radius instanceof NumberDouble) {
             area = new NumberDouble(PI*radius.getValue().doubleValue()*radius.getValue().doubleValue());
        }
        else if(radius instanceof NumberInt) {
             area = new NumberInt( (radius.getValue().intValue()) * (radius.getValue().intValue()));
             area = new NumberDouble(PI * area.getValue().intValue());
        }
        return  area;

    }//end of method

    //Begin of getters and setters
    @SuppressWarnings("unused")
    public T getRadius() {
        return radius;
    }

    @SuppressWarnings("unused")
    public void setRadius(T radius) {
        this.radius = radius;
    }

    @SuppressWarnings("unused")
    public T getArea() {
        return area;
    }

    @SuppressWarnings("unused")
    public void setArea(T area) {
        this.area = area;
    }

    //End of getters and setters
}//end of class
