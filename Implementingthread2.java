class Implementingthread2 implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("CHILD THREAD");
            Thread.sleep(1000);
            System.out.println("EXTENDED THREAD");
        }
        catch(InterruptedException e)
        {
            System.out.println(".....ERROR.....");
        }
    }
    public static void main(String args[])
    {
        Implementingthread2 i1=new Implementingthread2();
        Thread t1=new Thread();
        t1.start();
         }
}