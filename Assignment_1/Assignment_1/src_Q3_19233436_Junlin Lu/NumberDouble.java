/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: This is NumberDouble extending the class of Number
 * It holds an Double object and can return the Double object by getValue();
 */
public class NumberDouble extends Number {
    private Double numberDouble;

    public NumberDouble(double d){
        numberDouble = d;
    }

    public Double getValue(){
        return numberDouble;
    }
}
