
class Counter
{
    private int c;
    public Counter()
    {
        c = 0;
    }
    public synchronized void incrementCount()
    {
        for(int i = 0; i<=9; i++){
            c++;
            System.out.println(c);
        }
    }
    public synchronized void decrementCount()
    {
        for(int i = 0; i<=9; i++) {
            c--;
            System.out.println(c);
        }
    }
    public int getCount()
    {
        return c;
    }
}

class Thread1 extends Thread {
    Counter counter;
    Thread1(Counter counter)
    {
        this.counter = counter;
    }
    @Override
    public void run()
    {
        counter.incrementCount();
        System.out.println(counter.getCount());
    }
}
class Thread2 extends Thread {
    Counter counter;
    Thread2(Counter counter)
    {
        this.counter = counter;
    }
    @Override
    public void run()
    {
        counter.decrementCount();
        System.out.println(counter.getCount());
    }
}

public class SynchronizedMess {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread1(counter);
        Thread t2 = new Thread2(counter);
        t1.start();
        t2.start();

    }

}
