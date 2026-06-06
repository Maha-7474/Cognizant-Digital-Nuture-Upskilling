class MyThread implements Runnable
{
    private String message;
    MyThread(String message)
    {
        this.message = message;
    }
    @Override
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(message + " - " + i);
        }
    }
}
public class ThreadCreation
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new MyThread("Thread 1 is running"));
        Thread t2 = new Thread(new MyThread("Thread 2 is running"));
        t1.start();
        t2.start();
    }
}