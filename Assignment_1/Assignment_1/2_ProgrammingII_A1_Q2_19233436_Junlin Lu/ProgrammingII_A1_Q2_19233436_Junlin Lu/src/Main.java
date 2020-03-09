import java.util.ArrayList;
/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: Main class holds the main().
 * Creates three instances of Octagon, and adds them into an ArrayList.
 * In the first enhanced for-loop, call updateFromConsole() to set the fields of each instance.
 * In another enhanced for-loop call writeToConsole() to display the fields of the instances and calculate their area.
 * Then calls the findMax() passing in the ArrayList and find the octagon with the max area, and write its related fields
 * to the console.
 */
public class Main {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon();
        Octagon octagon2 = new Octagon();
        Octagon octagon3 = new Octagon();
        ArrayList<Octagon> octagonArrayList = new ArrayList<>();
        octagonArrayList.add(octagon1);
        octagonArrayList.add(octagon2);
        octagonArrayList.add(octagon3);
        for(Octagon octagon: octagonArrayList){
            octagon.updateFromConsole();
        }
        for(Octagon octagon:octagonArrayList){
            octagon.writeToConsole();
        }
        System.out.println("============Max Found=============");
       findMax(octagonArrayList).writeToConsole();

    }

    /**
     * Declare a so-called maxOctagon and use an enhanced for-loop to compare the area, and continuously assign the
     * temporarily biggest octagon to the maxOctagon. Return the reference of the biggest octagon at last.
     * @param arrayList@notNull
     * @return Octagon
     */
    public static Octagon findMax(ArrayList<Octagon> arrayList){
        Octagon maxOctagon = new Octagon();
        for(Octagon octagon: arrayList){
            if(octagon.compareTo(maxOctagon)>0){
                maxOctagon = octagon;
            }
        }
        return maxOctagon;
    }
}
