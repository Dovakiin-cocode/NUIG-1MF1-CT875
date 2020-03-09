/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: In my implementation, I create a abstract class AbstractWorker. It has all the fields
 * of original class Workaholic and Worker. But the instance of class Workaholic's field of coWorker
 * is null.
 * The abstract work() and work(int) are declared in the abstract class AbstractWorker. So we can make sure that there
 * are those methods in the subclass of AbstractWorker.
 * The main method is in Workaholic.
 */
public abstract class AbstractWorker {

    public static final int RETIREMENT_AGE = 65;
    public static final int OVERTIME = 500;

    private Worker coWorker;
    private String name;
    private int age;
    private float earned;
    private float hourlyIncome;

    public abstract void work();

    public abstract void work(int hours);

    /**
     * The method return the name and final earned.
     * @return @notNull
     */
    public String info(){
        return name+" earned "+earned;
    }

    @SuppressWarnings("unused")
    //Begin of setters and getters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getEarned() {
        return earned;
    }

    public void setEarned(float earned) {
        this.earned = earned;
    }

    public float getHourlyIncome() {
        return hourlyIncome;
    }

    public void setHourlyIncome(float hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public Worker getCoWorker() {
        return coWorker;
    }

    public void setCoWorker(Worker coWorker) {
        this.coWorker = coWorker;
    }
    //End of setters and getters.
}
