/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: Workaholic extends AbstractWorker, that is, it implements the abstract methods in AbstractWorker.
 * Also it contains the main().
 */
public class Workaholic extends AbstractWorker{

    public Workaholic(String name, float hourlyIncome, int age){
        setName(name);
        setHourlyIncome(hourlyIncome);
        setAge(age);
    }
    /**
     * Pass in int hours, and calculate the earned. For Workaholic the earned is the sum of the product of hourlyIncome
     * and the sum of hours and OVERTIME
     * @param hours @notNull
     */
    @Override
    public void work(int hours) {
            setEarned(getEarned()+getHourlyIncome()*(hours+OVERTIME));
    }

    /**
     * For Workaholic call work(2000)
     *
     */
    @Override
    public void work() {
        for(int i =getAge();i<RETIREMENT_AGE;i++)
            work(2000);
    }


    public static void main(String[] args) {
        Worker jane = new Worker("Jane", 20, 25, null);
        Worker john = new Worker("John", 20, 45, jane);
        Workaholic bill = new Workaholic("Bill", 20, 25);
        john.work();
        jane.work();
        bill.work();
        System.out.println(john.info());
        System.out.println(jane.info());
        System.out.println(bill.info());
    }
}
