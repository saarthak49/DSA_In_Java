public class TestingRunnable implements Runnable{

    @Override
    public void run() {
        int i = 10;
        while(i-->0)
        System.out.println("Hello from the testingRunnable class");
    }

    public void start()
    {
        System.out.println("Start called");
        Thread t1 = new Thread(this, "TestingRunnableThread");
        t1.start();
    }
}


class MainClass
{
    public static void main(String[] args) {
        TestingRunnable testingRunnable = new TestingRunnable();
        testingRunnable.start();
        System.out.println("Reached end of execution in main");
    }
}