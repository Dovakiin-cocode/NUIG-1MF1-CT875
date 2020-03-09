/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: interface ComparableGeometricFigure. Has an abstract
 * Ensures that only objects of subclasses of GeometricFigure2 are comparable with each other.
 */
public interface ComparableGeometricFigure<T extends GeometricFigure2> extends Comparable<T> {

    /**
     * Compares this object of the subclass of GeometricFigure2 with the specified object for order. Returns negative
     * integer, zero, or a positive integer as this object is less than, equal to or greater than the specified object.
     * @param o@notNull
     * @return int
     */
    @Override
    int compareTo(T o);
}
