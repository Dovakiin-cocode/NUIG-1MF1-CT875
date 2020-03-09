/**
 * @author: Junlin Lu
 * @date: 27/01/2020
 * @version: 1.0.0
 * @description: Worker extends AbstractWorker, that is, it implements the abstract methods in AbstractWorker.
 */
public class Worker extends AbstractWorker{
    public Worker(String name,float hourlyIncome, int age, Worker worker){
        setName(name);
        setHourlyIncome(hourlyIncome);
        setAge(age);
        setCoWorker(worker);
    }
    /**
     * Pass in int hours, and calculate the earned. For Worker it is the sum of hourlyIncome and this method deal with
     * the coWorker issues as well.
     * @param hours @notNull
     */
    @Override
    public void work(int hours) {
        for(int i = 1; i<=hours; i++) {
            setEarned(getEarned()+getHourlyIncome());
            if(getCoWorker()!=null && i%5==0)
                delegate(1); // from time to time
        }
    }

    /**
     * For Workaholic call work(1600)
     *
     */
    @Override
    public void work() {
        for(int i = getAge();i<RETIREMENT_AGE;i++)
            work(1600);
    }

    /**
     *
     * @param hours @notNull
     */
    @SuppressWarnings("")
    private void delegate(int hours){
        getCoWorker().work(hours);
    }
}
