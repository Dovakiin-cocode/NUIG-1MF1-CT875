/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: This is the super class of the Circle
 */
public abstract class GeometricFigure2  {
    private boolean filled;
    static final double PI = Math.PI;

    //constructor
    public GeometricFigure2(){
        filled = false;
    }

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

    public abstract Number calcArea();

}
