/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: This is NumberInt extending the class of Number
 * It holds an Integer object and can return the Integer object by getValue();
 */
public class NumberInt extends Number {
    private Integer numberInt;

    public NumberInt(int i){
        numberInt = i;
    }

    public Integer getValue(){
        return numberInt;
    }
}
