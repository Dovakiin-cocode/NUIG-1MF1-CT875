/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: This is the super class of Octagon and it is abstract as well.
 *
 */
public abstract class GeometricFigure2 {
    @SuppressWarnings("unused")
    public static final double PI = Math.PI;
    private boolean filled;

    //constructor
    public GeometricFigure2(){
        filled = false;
    }
    //This is an abstract method which should be implemented in every concrete subclasses of GeometricFigure2.
    //It is designed to calculate area of objects of subclasses of GeometricFigure2.
    public abstract double calcArea();

    //Useless, just copied from the slides.

    @Deprecated(since="The lecture slides")
    public boolean isFilled(){
        return filled;
    }
    @Deprecated(since="The lecture slides")
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Deprecated(since="The lecture slides")
    public void display(){
        System.out.println("This is some geometric figure. ");
    }
}
