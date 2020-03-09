import java.util.Scanner;
/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: This is a class of Octagon which extends GeometricFigure2 and implements ConsoleIO,
 * ComparableGeometricFigure<Octagon>
 */
public class Octagon extends GeometricFigure2 implements ConsoleIO, ComparableGeometricFigure<Octagon> {
    static Scanner scanner = new Scanner(System.in);// A static Scanner instance to take the input
    //The fields
    private String name;
    private double inCircleR;
    private double area;

    //The constructors
    public Octagon (){
        super();
    }

    @SuppressWarnings("unused")
    public Octagon (String name , double inCircleR, double area){
        this.name = name;
        this.inCircleR = inCircleR;
        this.area = area;
    }
    /**
     * updateFromConsole(): setName ,setInCircleR from the input of the console.
     * And set the calculated area.
     */
    @Override
    public void updateFromConsole() {
        System.out.println("Please input the name of this octagon: ");
        setName(scanner.next());
        System.out.println("Please input the inCircleRadius of the octagon:");
        setInCircleR(scanner.nextDouble());
        setArea(calcArea());
    }

    /**
     * Output the name, the inCircleR and the calculated area.
     */
    @Override
    public void writeToConsole() {
        System.out.println(getName()+ " is an octagon. The inCircle radius is: "+getInCircleR()+" Area is: "+getArea());
    }


    /**
     * calculate the area
     * @return double
     */
    @Override
    public double calcArea() {
        return (2+2*Math.sqrt(2))*getInCircleR()*getInCircleR();
    }

    /**
     * Pass in an octagon and compare with the octagon which calls the method.
     * And use the compare() in Double to return 1 if 'this.area>octagon.area';0 if 'this.area==octagon.area';-1 if
     * 'this.area<octagon.area'
     * @param octagon @notNull
     * @return Double
     */
    @Override
    public int compareTo(Octagon octagon) {
        return Double.compare(this.area, octagon.area);
    }

    //Begin of getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInCircleR() {
        return inCircleR;
    }

    public void setInCircleR(double inCircleR) {
        this.inCircleR = inCircleR;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    //End of getters and setters
}
